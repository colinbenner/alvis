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
package de.unisiegen.informatik.bs.alvis.graph.newwizards;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Command to open a new popup showing the new Graph wizard
 * 
 * @author Eduard Boos
 *
 */
public class showNewGraphWizard extends AbstractHandler {
	public static final String HANDLING_COMMAND_ID = "de.unisiegen.informatik.bs.alvis.graph.commands.showNewGraphWizard";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		NewGraphWizard graphWizard = new NewGraphWizard();
		WizardDialog dialog = new WizardDialog(HandlerUtil.getActiveShell(event), graphWizard);
		IWorkbench workbench = HandlerUtil.getActiveWorkbenchWindow(event).getWorkbench();
		ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
		if(currentSelection instanceof IStructuredSelection) {
			graphWizard.init(workbench, (IStructuredSelection)currentSelection);
		} else {
			graphWizard.init(workbench, null);
		}
		dialog.open();
		return null;
	}

}
