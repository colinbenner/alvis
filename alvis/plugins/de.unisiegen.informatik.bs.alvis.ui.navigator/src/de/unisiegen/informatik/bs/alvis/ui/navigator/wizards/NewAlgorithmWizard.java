/**
 * Creates a new Algorithm Wizard which creates a new File with the .algo extension
 */
package de.unisiegen.informatik.bs.alvis.ui.navigator.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;

/**
 * @author Eduard Boos
 *
 */
public class NewAlgorithmWizard extends Wizard implements INewWizard {

	private IStructuredSelection selection;
	private IWorkbench workbench;
	private NewAlgorithmWizardPage newAlgorithmWizardPage;
	public static final String ID = "de.unisiegen.informatik.bs.alvis.navigator.wizards.newAlgorithmWizard";
	public static final String WIZARD_ID = "de.unisiegen.informatik.bs.alvis.navigator.wizards.newAlgorithmWizard";
	
	/**
	 * 
	 */
	public NewAlgorithmWizard() {
		setWindowTitle("New Algorithm File");
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		this.workbench = workbench;
	}
	
    public void addPages() {
    	newAlgorithmWizardPage = new NewAlgorithmWizardPage(selection);
    	addPage(newAlgorithmWizardPage);
    }

	public boolean performFinish() {
		IFile file = createNewAlgorithmFile();
		if(file==null)
		{
			return false;
		}
		else
		{
			IWorkbenchPage wbPage = workbench.getActiveWorkbenchWindow().getActivePage();
			if (wbPage != null) {
				try {
					IDE.openEditor(wbPage, file, true);
				} catch (PartInitException e) {
					e.printStackTrace();
					return false;
				}
			}
			return true;
		}
	}

	private IFile createNewAlgorithmFile() {
	  	IFile file = newAlgorithmWizardPage.createNewFile();
	  	return file;
	}

}