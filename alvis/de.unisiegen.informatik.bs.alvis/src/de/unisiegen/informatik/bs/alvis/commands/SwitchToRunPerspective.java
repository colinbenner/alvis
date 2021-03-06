package de.unisiegen.informatik.bs.alvis.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.WorkbenchException;
import de.unisiegen.informatik.bs.alvis.Activator;
import de.unisiegen.informatik.bs.alvis.perspectives.RunPerspective;


public class SwitchToRunPerspective extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		// Switch to run perspective
		try {
		Activator.getDefault().getWorkbench()
			.showPerspective(RunPerspective.ID, 
					Activator.getDefault().getWorkbench().getActiveWorkbenchWindow());
		}
		catch (WorkbenchException e) {
			e.printStackTrace();
		}
		
		
		return null;
	}
}