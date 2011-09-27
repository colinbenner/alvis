package de.unisiegen.informatik.bs.alvis.sync.datatypes;

import java.util.HashMap;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCBoolean;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCInteger;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;

/**
 * Pseudo code implementation of a thread
 * 
 * @author Jan Bauerdick
 * 
 */

public class PCThread extends PCObject implements Runnable {

	protected static final String TYPENAME = "Actor";
	
	private boolean doStep;
	private boolean isBlocked;
	private int currentLine;

	public PCThread() {
		doStep = false;
		isBlocked = false;
		currentLine = 0;
	}

	public PCThread(GraphicalRepresentationThread gr) {
		allGr.add(gr);
		doStep = false;
		isBlocked = false;
		currentLine = 0;
	}

	public boolean isDoStep() {
		return doStep;
	}

	public void setDoStep(boolean doStep) {
		this.doStep = doStep;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	public int getCurrentLine() {
		return currentLine;
	}

	public void setCurrentLine(int currentLine) {
		this.currentLine = currentLine;
	}

	/**
	 * Perform a single step
	 */
	public synchronized void step() {
		if (!doStep && !isBlocked) {
			doStep = true;
			notify();
		}
	}

	/**
	 * Highlight a line in source
	 * @param line
	 */
	public synchronized void showline(PCInteger line) {
		currentLine = line.getLiteralValue();
		doStep = false;
		while (!doStep) {
			try {
				wait();
			} catch (InterruptedException e) {

			}
		}
	}

	@Override
	public String toString() {
		return TYPENAME + ": " + (isBlocked ? "" : "not") + " blocked on line "
				+ currentLine;
	}

	public PCObject set(String memberName, PCObject value) {
		// TODO remove this method
		if (memberName.equals("doStep")) {
			PCBoolean b = (PCBoolean) value;
			doStep = b.getLiteralValue();
			return this;
		} else if (memberName.equals("isBlocked")) {
			PCBoolean b = (PCBoolean) value;
			isBlocked = b.getLiteralValue();
			return this;
		} else if (memberName.equals("currentLine")) {
			PCInteger i = (PCInteger) value;
			currentLine = i.getLiteralValue();
			return this;
		}
		return null;
	}

	@Override
	public boolean equals(PCObject toCheckAgainst) {
		if (toCheckAgainst instanceof PCThread) {
			PCThread a = (PCThread) toCheckAgainst;
			if (a.isBlocked() == isBlocked() && a.isDoStep() == isDoStep()
					&& a.getCurrentLine() == getCurrentLine()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@Override
	public void updateGR(GraphicalRepresentation gr) {

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HashMap<String, String> getHelp() {
		// TODO Auto-generated method stub
		return null;
	}

}
