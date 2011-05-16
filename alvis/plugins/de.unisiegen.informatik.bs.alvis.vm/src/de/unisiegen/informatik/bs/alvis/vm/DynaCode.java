package de.unisiegen.informatik.bs.alvis.vm;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Class which handles the class path in order to be able to compile Java Code at runtime
 * 
 * @author Sebastian Schmitz
 */

public final class DynaCode {
	
	
	private String compileClasspath;

	private ClassLoader parentClassLoader;

	private ArrayList sourceDirs = new ArrayList();

	// class name => LoadedClass
	private HashMap loadedClasses = new HashMap();

	public DynaCode() {
		this(Thread.currentThread().getContextClassLoader());
	}

	public DynaCode(ClassLoader parentClassLoader) {
		this(extractClasspath(parentClassLoader), parentClassLoader);

	}
	/**
	 * @param compileClasspath
	 *            used to compile dynamic classes
	 * @param parentClassLoader
	 *            the parent of the class loader that loads all the dynamic
	 *            classes
	 */
	public DynaCode(String compileClasspath, ClassLoader parentClassLoader) {
		this.compileClasspath = compileClasspath;
		this.parentClassLoader = parentClassLoader;
		this.compileClasspath = this.compileClasspath.concat(":" +
									this.getClass().getProtectionDomain().getCodeSource().getLocation().getFile().toString()+"src/:"+
									this.getClass().getProtectionDomain().getCodeSource().getLocation().getFile().toString()+":"+
									this.getClass().getProtectionDomain().getCodeSource().getLocation().getFile().toString()+"vm/:"+
									this.getClass().getProtectionDomain().getCodeSource().getLocation().getFile().toString()+"vm/src/:"
								);
	}

	/**
	 * Add a directory that contains the source of dynamic java code.
	 * 
	 * @param srcDir
	 * @return true if the add is successful
	 * @throws IOException 
	 */
	public boolean addSourceDir(File srcDir) {
		try {
			srcDir = srcDir.getCanonicalFile();
			
		} catch (IOException e) {
			// ignore
		}

		synchronized (sourceDirs) {

			// check existence
			for (int i = 0; i < sourceDirs.size(); i++) {
				SourceDir src = (SourceDir) sourceDirs.get(i);
				if (src.srcDir.equals(srcDir)) {
					return false;
				}
			}

			// add new
			SourceDir src = new SourceDir(srcDir);
			sourceDirs.add(src);

			info("Add source dir " + srcDir);
		}

		return true;
	}

	/**
	 * Returns the up-to-date dynamic class by name.
	 * 
	 * @param className
	 * @return
	 * @throws ClassNotFoundException
	 *             if source file not found or compilation error
	 */
	public Class loadClass(String className) throws ClassNotFoundException {

		LoadedClass loadedClass = null;
		synchronized (loadedClasses) {
			loadedClass = (LoadedClass) loadedClasses.get(className);
		}

		// first access of a class
		if (loadedClass == null) {

			String resource = className.replace('.', '/') + ".java";
			SourceDir src = locateResource(resource);
			if (src == null) {
				throw new ClassNotFoundException("DynaCode class not found "
						+ className);
			}

			synchronized (this) {

				// compile and load class
				loadedClass = new LoadedClass(className, src);

				synchronized (loadedClasses) {
					loadedClasses.put(className, loadedClass);
				}
			}

			return loadedClass.clazz;
		}

		// subsequent access
		if (loadedClass.isChanged()) {
			// unload and load again
			unload(loadedClass.srcDir);
			return loadClass(className);
		}

		return loadedClass.clazz;
	}

	private SourceDir locateResource(String resource) {
		for (int i = 0; i < sourceDirs.size(); i++) {
			SourceDir src = (SourceDir) sourceDirs.get(i);
			if (new File(src.srcDir, resource).exists()) {
				return src;
			}
		}
		return null;
	}

	private void unload(SourceDir src) {
		// clear loaded classes
		synchronized (loadedClasses) {
			for (Iterator iter = loadedClasses.values().iterator(); iter
					.hasNext();) {
				LoadedClass loadedClass = (LoadedClass) iter.next();
				if (loadedClass.srcDir == src) {
					iter.remove();
				}
			}
		}

		// create new class loader
		src.recreateClassLoader();
	}

	/** 
	 * Class to handle the directories relevant for compiling
	 */
	private class SourceDir {
		File srcDir;

		File binDir;

		Javac javac;

		URLClassLoader classLoader;

		SourceDir(File srcDir) {
			this.srcDir = srcDir;

			String subdir = srcDir.getAbsolutePath().replace(':', '_').replace(
					'/', '_').replace('\\', '_');
			this.binDir = new File(System.getProperty("java.io.tmpdir"), subdir);
			this.binDir.mkdirs();

			// prepare compiler
			this.javac = new Javac(compileClasspath, binDir.getAbsolutePath());
			
			// class loader
			recreateClassLoader();
		}
		
		void recreateClassLoader() {
			try {
				classLoader = new URLClassLoader(new URL[] { binDir.toURI().toURL() },
						parentClassLoader);
			} catch (MalformedURLException e) {
				// should not happen
			}
		}

	}

	private static class LoadedClass {
		String className;

		SourceDir srcDir;

		File srcFile;

		File binFile;

		Class clazz;

		long lastModified;

		LoadedClass(String className, SourceDir src) {
			this.className = className;
			this.srcDir = src;

			String path = className.replace('.', '/');
			this.srcFile = new File(src.srcDir, path + ".java");
			this.binFile = new File(src.binDir, path + ".class");

			compileAndLoadClass();
		}

		boolean isChanged() {
			return srcFile.lastModified() != lastModified;
		}

		void compileAndLoadClass() {

			if (clazz != null) {
				return; // class already loaded
			}

			// compile, if required
			String error = null;
			if (binFile.lastModified() < srcFile.lastModified()) {
				error = srcDir.javac.compile(new File[] { srcFile });
			}

			if (error != null) {
				throw new RuntimeException("Failed to compile "
						+ srcFile.getAbsolutePath() + ". Error: " + error);
			}

			try {
				// load class
				clazz = srcDir.classLoader.loadClass(className);

				// load class success, remember timestamp
				lastModified = srcFile.lastModified();

			} catch (ClassNotFoundException e) {
				throw new RuntimeException("Failed to load DynaCode class "
						+ srcFile.getAbsolutePath());
			}

			info("Init " + clazz);
		}
	}
	/**
	 * Extracts a classpath string from a given class loader. Recognizes only
	 * URLClassLoader.
	 */
	private static String extractClasspath(ClassLoader cl) {
		StringBuffer buf = new StringBuffer();
		while (cl != null) {
			if (cl instanceof URLClassLoader) {
				URL urls[] = ((URLClassLoader) cl).getURLs();
				for (int i = 0; i < urls.length; i++) {
					if (buf.length() > 0) {
						buf.append(File.pathSeparatorChar);
					}
					buf.append(urls[i].getFile().toString());
				}
			}
			cl = cl.getParent();
		}

		return buf.toString();
	}

	/**
	 * Log a message.
	 */
	private static void info(String msg) {
		// System.out.println("[DynaCode] " + msg);
	}

}