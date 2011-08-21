package de.unisiegen.informatik.bs.alvis.editors;

import de.unisiegen.informatik.bs.alvis.io.logger.Logger;

/**
 * This class should be started as a Thread to check the time when the last
 * keystroke happened and compile + markErrors if this time was longer than
 * 499ms. This will be the case when no keystroke happened the last 500ms.
 * 
 * 
 * @author Eduard Boos
 * 
 */
public class CheckTimeAndMarkErrors implements Runnable {

	private AlgorithmEditor editor;
	private String code;

	/**
	 * Create a new CheckTimeAndMarkErrors, editor is the Editor to check the
	 * last keystroke and code the current content.
	 * 
	 * @param editor
	 *            the AlgorithmEditor to check and markErrors.
	 * @param code
	 *            String the current content of the editor.
	 */
	public CheckTimeAndMarkErrors(AlgorithmEditor editor, String code) {
		this.editor = editor;
		this.code = code;
	}

	public void run() {
		editor.lastKeyStroke = System.currentTimeMillis();
		synchronized (this) {
			try {
				wait(500);
			} catch (InterruptedException e) {
				Logger.getInstance().log("AlgorithmEditorCompletionsProcessor->CheckTimeAndMarkErrors", Logger.ERROR, "CheckTimeAndMarkErrors thread was interrupted.");
			}
			if ((System.currentTimeMillis() - editor.lastKeyStroke) > 499) {
				if (editor.isCompilationNeeded(code)) {
					editor.compileCode(code);
					editor.markErrors();
				}
			}
		}
	}

}
