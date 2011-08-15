package de.unisiegen.informatik.bs.alvis.vm;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeSet;
import java.util.concurrent.locks.Lock;

import de.unisiegen.informatik.bs.alvis.io.logger.Logger;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.SortableCollection;

/**
 * Class capsulating Algo with all Information needed for handling plus methods
 * to move the thread forward and backward
 * 
 * TODO DP Handling
 * 
 * @author Dominik Dingel
 * 
 */

public class AlgoThread {
	// shared object across all threads to sync run
	private Lock lock;

	// BreakPointlisteners, to be identified in case of Breakpoint
	private ArrayList<BPListener> bpListeners;

	// a arraylist of pcobjects
	// to be passed as start parameters, these can to enable shared access also
	// be references to the PCObjects of an other Algo
	private Map<String, PCObject> parameters;

	// Current Thread Object of the Algo
	private Thread algoThread;

	// Current AbstractAlgo Object
	private AbstractAlgo algoInst;

	// Current Class Object
	private Class<AbstractAlgo> algoClass;

	// Saving to a Line Number a counter how often we hit this
	private HashMap<Integer, Integer> lineCounter;

	// last LineCounter, comes handy when stepping backwards, sometimes
	// containing computed values instead of realworld
	private HashMap<Integer, Integer> lastCounter;

	// helper to decide if we are currently on break, or moving backwards
	private boolean onBreak;

	// reference to dplistener
	private DPListener dpListen;
	private HashMap<Integer, Queue<SortableCollection>> dPoints;
	// walinkg back
	private HashMap<Integer, Queue<SortableCollection>> dPointsTemp;

	/**
	 * Creates new AlgoThread, will directly load the fileName, create the Class
	 * Inst and the Thread Object
	 * 
	 * @param pathName
	 * @param fileName
	 * @param toLockOn
	 * @param packagesToAddToClasspath
	 */
	public AlgoThread(String pathName, String fileName, Lock toLockOn,
			TreeSet<String> dynamicallyReferencedPackagesNeededToCompile)
			throws ClassNotFoundException {
		Logger.getInstance().log("de.~.vm.AlgoThread", Logger.DEBUG, "AlgoThread(String pathName, String fileName, Lock toLockOn, ArrayList<Object> datatypesToAddToClasspath)" +
				"\n pathName: " + pathName +
				"\n fileName: " + fileName +
				"\n toLockOn: " + toLockOn +
				"\n datatypesToAddToClasspath: " + dynamicallyReferencedPackagesNeededToCompile);
		bpListeners = new ArrayList<BPListener>();
		lineCounter = new HashMap<Integer, Integer>();
		lastCounter = new HashMap<Integer, Integer>();
		dPoints = new HashMap<Integer, Queue<SortableCollection>>();
		parameters = null;
		onBreak = false;
		lock = toLockOn;
		Logger.getInstance().log("de.~.vm.AlgoThread", Logger.DEBUG, "PRE - loading the class");
		loadAlgo(pathName, fileName, dynamicallyReferencedPackagesNeededToCompile);
		Logger.getInstance().log("de.~.vm.AlgoThread", Logger.DEBUG, "POST - loading the class");

		createThread();
	}

	/**
	 * Set the start parameters should be called before the algo started
	 * 
	 * @param paras
	 */
	public void setParameters(Map<String, PCObject> paras) {
		algoInst.setParameters(paras);
		parameters = paras;
	}

	/**
	 * deletes the parameters
	 */
	public void deleteParamters() {
		parameters = null;
	}

	/**
	 * add BP Listener, if the current one is already listed, the request will
	 * be ignored
	 * 
	 * @param wantsToListen
	 */
	public void addBPListener(BPListener wantsToListen) {
		// if bplistener already is in the to notify list, just ignore the wish
		// "one cross each"
		if (bpListeners.contains(wantsToListen)) {
			return;
		}
		bpListeners.add(wantsToListen);
	}

	// TODO javadoc + clean
	public void addDPListener(DPListener toListen) {
		dpListen = toListen;
	}

	/**
	 * bpListeners to remove
	 * 
	 * @param toRemove
	 */
	public void removeBPListener(BPListener toRemove) {
		bpListeners.remove(toRemove);
	}

	/**
	 * removes all BP Listeners
	 */
	public void removeBPListeners() {
		bpListeners.clear();
	}

	/**
	 * gives Current ThreadState
	 * 
	 * @return ThreadState Object
	 */
	public Thread.State getCurrentThreadState() {
		return algoThread.getState();
	}

	/**
	 * Passes over the needed Parameter Types for the specific Algo TODO update
	 * javadoc
	 * 
	 * @return ArrayList with PCObject ArrayList, should be never a nullpointer
	 */
	public Map<String, PCObject> getParameterTypes() {
		return algoInst.getParameterTypes();
	}

	/**
	 * helper function to create algo Thread from class object
	 */
	private void createThread() {
		try {
			algoInst = (AbstractAlgo) algoClass.getConstructors()[0]
					.newInstance();
			algoInst.setLock(lock);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		algoThread = new Thread(algoInst);
	}

	/**
	 * loads the Algo key from the file named fileName
	 * 
	 * @param pathToFile
	 * @param fileName
	 *            without .java postfix
	 */
	private void loadAlgo(String pathToFile, String fileName,
			TreeSet<String> dynamicallyReferencedPackagesNeededToCompile)
			throws ClassNotFoundException {
		Logger.getInstance().log("de.~.vm.AlgoThread.loadAlgo()", Logger.DEBUG, "new DynaCode()");
		DynaCode dynacode = new DynaCode(dynamicallyReferencedPackagesNeededToCompile);

		Logger.getInstance().log("de.~.vm.AlgoThread.loadAlgo()", Logger.DEBUG, ".addSourceDir()");
		dynacode.addSourceDir(pathToFile, new File(fileName));
		Logger.getInstance().log("de.~.vm.AlgoThread.loadAlgo()", Logger.DEBUG, "Source Dir added!");
		
		algoClass = dynacode.loadClass(fileName);
		Logger.getInstance().log("de.~.vm.AlgoThread.loadAlgo()", Logger.DEBUG, "Class loaded");
	}

	/**
	 * Start the Thread, only if parameters is NOT NULL
	 */
	public void startAlgo() {
		if (parameters == null)
			return;
		onBreak = false;
		algoInst.addBPListener(new BPListener() {
			/**
			 * BPNr = Line number
			 */
			@Override
			public void onBreakPoint(int BPNr) {
				if (lineCounter.containsKey(new Integer(BPNr))) {
					int tmp = lineCounter.get(new Integer(BPNr)).intValue();
					tmp++;
					lineCounter.put(new Integer(BPNr), tmp);
				}
				// first time we reach this breakpoint
				else {
					int tmp = 1;
					lineCounter.put(new Integer(BPNr), tmp);
				}
				onBreak = true;
				// inform all registered breakpoint listeners
				for (BPListener toInform : bpListeners) {
					toInform.onBreakPoint(BPNr);
				}
			}
		});
		algoInst.addDPListener(new DPListener() {
			@Override
			public void onDecisionPoint(int DPNr, PCObject from,
					SortableCollection toSort) {
				Integer key = new Integer(DPNr);
				dpListen.onDecisionPoint(DPNr, from, toSort);
				if (dPoints.containsKey(key)) {
					dPoints.get(key).add(toSort);
				} else {
					dPoints.put(key, new LinkedList<SortableCollection>());
					dPoints.get(key).add(toSort);
				}
			}
		});
		algoThread.start();
	}

	/**
	 * will wait for Algo
	 */
	public void waitAlgoFinished() {
		try {
			algoThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * stops running thread with creating new one
	 */
	public void stopAlgo() {
		createThread();
	}

	/**
	 * let the algo get one step forward, can also be called if there is no need
	 * to step forward
	 */
	public void stepForward() {
		if (algoThread.getState().compareTo(Thread.State.TIMED_WAITING) == 0
				|| algoThread.getState().compareTo(Thread.State.WAITING) == 0) {
			synchronized (algoThread) {
				algoInst.stopBreak();
				algoThread.notify();
			}
		}
	}

	/**
	 * blocking call to wait for breakpoint event
	 */
	public void waitForBreakpoint() {
		synchronized (this) {
			while (onBreak == false) {
				try {
					this.wait(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * Variables used from the algo
	 * 
	 * @return List of PCObjects of used Variables
	 */
	public List<PCObject> returnReferences() {
		return algoInst.getVariableReferences();
	}

	/**
	 * let the algo restart, and running till the previous Breakpoint
	 */
	@SuppressWarnings("unchecked")
	public void stepBackward() {
		// saving temp list for walking back
		dPointsTemp = (HashMap<Integer, Queue<SortableCollection>>) dPoints
				.clone();
		HashMap<Integer, Integer> tmp = new HashMap<Integer, Integer>();
		tmp.put(new Integer(0), new Integer(1));
		// we are already on the first step, there is no way we can step more
		// backwards
		if (diff(lineCounter, tmp) < 1)
			return;

		this.createThread();

		// active batch mode
		for (PCObject obj : parameters.values()) {
			obj.batchModification(true);
		}

		algoInst.setParameters(parameters);
		lastCounter = (HashMap<Integer, Integer>) lineCounter.clone();
		reduce(lastCounter);
		lineCounter.clear();
		onBreak = false;
		// TODO won't forget any decisions made, fix me to support removing from
		// one
		algoInst.addDPListener(new DPListener() {
			@Override
			public void onDecisionPoint(int DPNr, PCObject from,
					SortableCollection toSort) {
				Integer key = new Integer(DPNr);
				toSort = dPointsTemp.get(key).poll();
			}
		});

		algoInst.addBPListener(new BPListener() {
			@Override
			public void onBreakPoint(int BPNr) {
				// this is a already reached Breakpoint
				if (lineCounter.containsKey(new Integer(BPNr))) {
					int tmp = lineCounter.get(new Integer(BPNr)).intValue();
					tmp++;
					lineCounter.put(new Integer(BPNr), tmp);
				}
				// first time we reach this breakpoint
				else {
					int tmp = 1;
					lineCounter.put(new Integer(BPNr), tmp);
				}

				// reached the previous state, great, so we are done
				if (diff(lineCounter, lastCounter) == 0) {
					// we are one state before the finishline, lets stop batch
					// mode
					for (PCObject obj : parameters.values()) {
						obj.batchModification(false);
					}
					// inform all registerd breakpoint listeners
					for (BPListener toInform : bpListeners) {
						toInform.onBreakPoint(BPNr);
					}
					reduce(lastCounter);
					onBreak = true;
					algoInst.addBPListener(new BPListener() {
						@Override
						public void onBreakPoint(int BPNr) {
							if (lineCounter.containsKey(new Integer(BPNr))) {
								int tmp = lineCounter.get(new Integer(BPNr))
										.intValue();
								tmp++;
								lineCounter.put(new Integer(BPNr), tmp);
							}
							// first time we reach this breakpoint
							else {
								int tmp = 1;
								lineCounter.put(new Integer(BPNr), tmp);
							}
							onBreak = true;
							// inform all registerd breakpoint listeners
							for (BPListener toInform : bpListeners) {
								toInform.onBreakPoint(BPNr);
							}
						}
					});
					algoInst.addDPListener(new DPListener() {
						@Override
						public void onDecisionPoint(int DPNr, PCObject from,
								SortableCollection toSort) {
							Integer key = new Integer(DPNr);
							dpListen.onDecisionPoint(DPNr, from, toSort);
							if (dPoints.containsKey(key)) {
								dPoints.get(key).add(toSort);
							} else {
								dPoints.put(key,
										new LinkedList<SortableCollection>());
								dPoints.get(key).add(toSort);
							}
						}
					});

				} else {
					synchronized (algoThread) {
						algoInst.stopBreak();
						algoThread.notify();
					}
				}
			}
		});
		algoThread.start();
	}

	/**
	 * Helper function calculation from to HashMaps the difference, needed for
	 * Breakpoint counting
	 * 
	 * @param first
	 *            HashMap
	 * @param second
	 *            HashMap
	 * @return Sum(first) - Sum(second)
	 */
	private int diff(HashMap<Integer, Integer> first,
			HashMap<Integer, Integer> second) {
		int sum_first = 0;
		int sum_second = 0;
		for (Integer it : first.values()) {
			sum_first += it.intValue();
		}
		for (Integer it : second.values()) {
			sum_second += it.intValue();
		}
		return sum_first - sum_second;
	}

	/**
	 * Helper function to reduce from lastCounter one Breakpoint
	 * 
	 * @param arg
	 */
	private void reduce(HashMap<Integer, Integer> arg) {
		// lastCounter is already empty, nothing to do here
		if (arg.isEmpty())
			return;

		int tmp = 0;
		tmp = arg.get(arg.keySet().toArray()[0]).intValue();
		tmp -= 1;
		arg.put((Integer) arg.keySet().toArray()[0], new Integer(tmp));

	}

	/**
	 * If the Algo is alive
	 * 
	 * @return
	 */
	public boolean isAlive() {
		return algoThread.isAlive();
	}
}
