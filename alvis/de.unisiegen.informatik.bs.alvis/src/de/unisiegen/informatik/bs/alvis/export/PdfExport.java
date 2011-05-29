package de.unisiegen.informatik.bs.alvis.export;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import de.unisiegen.informatik.bs.alvis.Activator;
import de.unisiegen.informatik.bs.alvis.extensionpoints.IExportItem;

//TODO replace static strings with dynamic, language-specific files
/**
 * class which creates the export PDF file
 * 
 * @author Frank Weiler
 */
public class PdfExport extends Document {

	private static Font titleFont = new Font(Font.FontFamily.TIMES_ROMAN, 32,
			Font.BOLD);
	private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
			Font.BOLD);
	private static Font colorfont = new Font(Font.FontFamily.COURIER, 12,
			Font.ITALIC, BaseColor.BLUE);
	private static Font blackFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
			Font.NORMAL);
	private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
			Font.BOLD);
	private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
			Font.BOLD);
	// TODO Relativ zum System machen!
	private static String FILE = "C:/Users/bearer/Desktop/" + "MyAlvisExport"
			+ ".pdf";

	/**
	 * the constructor creates export PDF file, opens file dialog to ask where
	 * to save the file
	 * 
	 * @throws DocumentException
	 */
	public PdfExport() throws DocumentException {

		try {

			PdfWriter.getInstance(this, new FileOutputStream(FILE));
			open();

			addMetaData();
			addTitle();
			addContent();

			close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	/**
	 * adds meta data to this document
	 */
	private void addMetaData() {
		addTitle("Alvis export");
		addSubject("Alvis Export");
		addKeywords("Alvis, Java, PDF");
		addAuthor("AlvisPg2011");
		addCreator("Alvis");
	}

	/**
	 * adds title page to this document
	 * 
	 * @throws DocumentException
	 */
	private void addTitle() throws DocumentException {
		Paragraph title = new Paragraph();
		addEmptyLine(title, 1);

		title.add(new Paragraph("Alvis Export", titleFont));

		addEmptyLine(title, 1);

		title.add(new Paragraph("Generated by: "
				+ System.getProperty("user.name") + ", " + new Date(),
				smallBold));

		add(title);
		newPage();
	}

	private void addContent() throws DocumentException {

		ArrayList<IExportItem> exportItems = Activator.getDefault()
				.getExportItems();

		for (IExportItem exportItem : exportItems) {
			addSourceCode(exportItem.getSourceCode());
			try {
				addImage(exportItem.getImage());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// // GET THE ACTIVE EDITOR
		// IExportItem activeEditor = (IExportItem) Activator.getDefault()
		// .getWorkbench().getActiveWorkbenchWindow().getActivePage()
		// .getActiveEditor();
		// addSourceCode(activeEditor.getSourceCode());
		// addImage(activeEditor.getImage());
		//
		// // PROBLEM NULLPOINTEREXCEOTION weil der die Instanz des IExportItem
		// // neu erzeugt und nicht den aktiven Graph nimmt.
		// IExtensionRegistry registry = Platform.getExtensionRegistry();
		// IExtensionPoint extensionPoint = registry
		// .getExtensionPoint("de.unisiegen.informatik.bs.alvis.export");
		//
		// for (IExtension extension : extensionPoint.getExtensions()) {
		//
		// IConfigurationElement[] elements = extension
		// .getConfigurationElements();
		//
		// for (IConfigurationElement element : elements) {
		//
		// try {
		// IExportItem myExportItem = (IExportItem) element
		// .createExecutableExtension("class");
		//
		// // add all export items to the export file:
		// String sourceCode = myExportItem.getSourceCode();
		// addSourceCode(sourceCode);
		// Image image = myExportItem.getImage();
		// addImage(image);
		// } catch (CoreException e) {
		// e.printStackTrace();
		// }
		//
		// }
		//
		// }

	}

	/**
	 *  adds organized, structured, highlighted source code to pdf file
	 * @author Sebastian Schmitz & Frank Weiler
	 * @param sourceCode
	 * 		the source code as string including html tags for highlighting
	 *            etc
	 *  @throws DocumentException
	 *             will be thrown when new paragraph could not have been added
	 */
	private void addSourceCode(String sourceCode) throws DocumentException {
		if (sourceCode == null)
			return;
		// TODO Absoluten Pfad durch Pfad relativ zum Projekt ersetzen!
		System.out.println(this.getClass().getProtectionDomain().getCodeSource().getLocation().getFile().toString());
		String file ="";
		try {
			file = readFile("/home/basti/Programmierung/runtime-de.unisiegen.informatik.bs.alvis.product/labertest/src/algorithm.algo");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("readFile: "+ file);
		file = putFormattedHTMLStringToHTMLCode(highlightString(file));
		
		Paragraph paragraph = new Paragraph("source code", subFont);
		add(paragraph);
		paragraph.add("1 this\n2 is\n3 a\n4 source\n5 code\n6 dummy");
}

	/**
	 * adds image to pdf file
	 * 
	 * @param image
	 *            the image which will be parsed to a pdf-valid format
	 * @throws DocumentException
	 *             will be thrown when new paragraph could not have been added
	 */
	private void addImage(Image image) throws DocumentException {
		if (image == null)
			return;

		String path = "C:/Users/bearer/Desktop/" + "tmpAlvisImage" + ".png";
		com.itextpdf.text.Image pdfImage;

		Paragraph paragraph = new Paragraph("image", subFont);
		add(paragraph);

		ImageLoader loader = new ImageLoader();
		loader.data = new ImageData[] { image.getImageData() };
		loader.save(path, SWT.IMAGE_PNG);

		addEmptyLine(paragraph, 2);
		try {
			pdfImage = com.itextpdf.text.Image.getInstance(path);
			float height, width;
			width = Math.min(530, pdfImage.getScaledWidth());
			height = pdfImage.getScaledHeight() / pdfImage.getScaledWidth()
					* width;
			pdfImage.scaleAbsolute(width, height);
			paragraph.add(pdfImage);
		} catch (Exception e) {
			e.printStackTrace();
		}
		addEmptyLine(paragraph, 2);

		image.dispose();

	}

	/**
	 * adds empty lines (i.e. line breaks) to given paragraph
	 * 
	 * @param paragraph
	 *            the paragraph to add empty lines to
	 * @param amount
	 *            the amount of empty lines
	 */
	private void addEmptyLine(Paragraph paragraph, int amount) {
		for (int i = 0; i < amount; i++) {
			paragraph.add(new Paragraph(" "));
		}
	} 
	
	/**
	 * @author Sebastian Schmitz
	 * returns formatted content of the selected .algo file as string
	 * @param pathToFile
	 * @return 
	 * @throws IOException  
	 */
	private String readFile(String pathToFile) throws IOException{
		FileInputStream in = new FileInputStream(pathToFile);
		String content = "";
		int b = in.read();
		while (b!= -1){
			content = content.concat((Character.toString((char) b)));
			b = in.read();
		}
		in.close();
		return content;
	}
	
	/**
	 * @author Sebastian Schmitz
	 * Embed the highlighted Text in a HTML file
	 * @param string
	 * @return String representing a completed HTML file
	 */
	private String putFormattedHTMLStringToHTMLCode(String string) {
		String HTMLCode = "";
		HTMLCode += ""+"<html> "+'\n';
		HTMLCode += ""+'\t'+ "<head>" + '\n';
		HTMLCode += ""+'\t'+ '\t' + "<title> Source Code generated by Alvis Version X </title>" + '\n';// TODO: Versionsnummer!
		HTMLCode += ""+'\t'+ "</head>" + '\n';
		HTMLCode += ""+'\t'+ "<body>" + '\n';
		HTMLCode += ""+'\t'+ '\t' + "<pre>" + '\n';
		HTMLCode += ""+string;
		HTMLCode += ""+'\t'+ '\t' + "</pre>" + '\n';
		HTMLCode += ""+'\t'+ "</body>" + '\n';
		HTMLCode += ""+"</html> "+'\n';
		return HTMLCode;
	    
	}
	
	/**
	 * accepts string and returns it with tokens highlighted using HTML tags
	 * @param stringToHighight
	 * @return highlighted String
	 */
	private String highlightString(String stringToHighight){
		ArrayList<String> tokenList = new ArrayList<String>();
		tokenList.add("end");
		tokenList.add("begin");
		tokenList.add("while");
		tokenList.add("for");
		tokenList.add("if");
		tokenList.add("in");
		tokenList.add("infty");
		tokenList.add("null");
		// TODO Diese Liste unbedingt mit der aus der Grammatik erzeugten Tokenlist ersetzen!
		String temp = "";
		String toReturn = ""+'\t'+'\t';
		// Read the String charwise
		for(int i = 0; i < stringToHighight.length(); i++){
			if(stringToHighight.charAt(i) != '\t' && stringToHighight.charAt(i) != '\n' && stringToHighight.charAt(i) != ' '){
				// read the next word
				temp += stringToHighight.charAt(i);
			}
			else {
				// if the word is complete, check if it is a token
				if(tokenList.contains(temp)){
					// if so, surround it with a color tag
					temp = "<font color=\"#FF00FF\">" + temp + "</font>";
				}
				toReturn += temp;
				temp = "";
				// write the current whitespace
				toReturn += stringToHighight.charAt(i);
			}
			// reestablish indendation in the HTML file, not visible in the export
			if ( stringToHighight.charAt(i) == '\n' &&  stringToHighight.charAt(i+1) != -1)
				toReturn += "" + '\t' +'\t';
		}
		return toReturn;
	}
 
}
