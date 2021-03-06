/*
 * Copyright (c) 2011 Eduard Boos
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in the
 * Software without restriction, including without limitation the rights to use, 
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the 
 * Software, and to permit persons to whom the Software is furnished to do so, 
 * subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all 
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION 
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.unisiegen.informatik.bs.alvis.editors;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.TextPresentation;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationPresenter;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;

import de.unisiegen.informatik.bs.alvis.compiler.CompilerAccess;
import de.unisiegen.informatik.bs.alvis.compiler.CompletionInformation;
import de.unisiegen.informatik.bs.alvis.io.logger.Logger;

/**
 * Provides Content Assist(Code-Completion) functionality to the AlgorithmEditor.
 * This is the class to change, when advanced code-completion shall be implemented.
 * 
 * @author Eduard Boos
 * 
 */
public class AlgorithmEditorCompletionProcessor implements
		IContentAssistProcessor {

	public AlgorithmEditorCompletionProcessor() {
	}

	/**
	 * Simple content assist tip closer. The tip is valid in a range of 5
	 * characters around its popup location.
	 */
	protected static class Validator implements IContextInformationValidator,
			IContextInformationPresenter {

		protected int fInstallOffset;

		/*
		 * @see IContextInformationValidator#isContextInformationValid(int)
		 */
		@Override
		public boolean isContextInformationValid(int offset) {
			return Math.abs(fInstallOffset - offset) < 5;
		}

		/*
		 * @see IContextInformationValidator#install(IContextInformation,
		 * ITextViewer, int)
		 */
		@Override
		public void install(IContextInformation info, ITextViewer viewer,
				int offset) {
			fInstallOffset = offset;
		}

		/*
		 * @see
		 * org.eclipse.jface.text.contentassist.IContextInformationPresenter
		 * #updatePresentation(int, TextPresentation)
		 */
		@Override
		public boolean updatePresentation(int documentPosition,
				TextPresentation presentation) {
			return false;
		}
	}

	@Override
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer,
			int offset) {
		int line = -1;
		int charPositionInLine = -1;
		try {
			CompilerAccess.getDefault().compileString(viewer.getTextWidget().getText());
			line = viewer.getDocument().getLineOfOffset(offset);
			charPositionInLine = offset
					- viewer.getDocument().getLineOffset(line);
			line++;
		} catch (BadLocationException e) {
			Logger.getInstance().log("Editor->AlgorithmEditorCompletionProcessor", Logger.ERROR, "Code-Completion caused an BadLocationException: \n"+ e.getLocalizedMessage()); //$NON-NLS-1$ //$NON-NLS-2$
		} catch (IOException e) {
			Logger.getInstance().log("Editor->AlgorithmEditorCompletionProcessor", Logger.ERROR, "Code-Completion caused an IOException: \n"+ e.getLocalizedMessage()); //$NON-NLS-1$ //$NON-NLS-2$
			return null;
		}
		List<CompletionInformation> availableProposals = new ArrayList<CompletionInformation>();
		if (line != -1 && charPositionInLine != -1) {
			availableProposals = CompilerAccess.getDefault().tryAutoCompletion(
					line, charPositionInLine);

		}
		/** creation of the CompletionProposal Array */
		List<CompletionProposal> resultList = new ArrayList<CompletionProposal>();
		for (int i = 0; i < availableProposals.size(); i++) {

			CompletionInformation currentProposal = availableProposals.get(i);
			if (currentProposal != null) {
//				TODO if needed add Context Information here
//				ContextInformation contextInfo = new ContextInformation(
//						currentProposal.getReplacementString(),
//						Messages.AlgorithmEditorCompletionProcessor_contextInformationFor + " "
//								+ currentProposal.getReplacementString());
				int replacementOffset = viewer.getTextWidget().getOffsetAtLine((
						currentProposal.getLine()-1))
						+ currentProposal.getCharPositionInLine();
				CompletionProposal completionProposal = new CompletionProposal(
						currentProposal.getReplacementString(),
						replacementOffset,
						currentProposal.getReplacementLength(), currentProposal
								.getReplacementString().length(), null,
						currentProposal.getReplacementString(), null,
						Messages.AlgorithmEditorCompletionProcessor_additionalInformationFor + " "
								+ currentProposal.getReplacementString()
								+ "\n" + currentProposal.getInformationText());
				resultList.add(completionProposal);
			}
		}
		ICompletionProposal[] result = new ICompletionProposal[availableProposals
				.size()];
		result = resultList.toArray(new ICompletionProposal[0]);
		return result;
	}

	@Override
	public IContextInformation[] computeContextInformation(ITextViewer viewer,
			int offset) {
		/** no context Information needed at the moment */
		return null;
	}

	@Override
	/**
	 * Completions should be shown after the char "."
	 */
	public char[] getCompletionProposalAutoActivationCharacters() {
		return new char[] { '.' };
	}

	@Override
	public char[] getContextInformationAutoActivationCharacters() {
		/** no context Information needed at the moment */
		return null;
	}

	@Override
	public IContextInformationValidator getContextInformationValidator() {
		/** defines how long the Context Information is shown(valid) */
		return new Validator();
	}

	@Override
	public String getErrorMessage() {
		return null;
	}

}
