package de.unisiegen.informatik.bs.alvis.primitive.datatypes;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Wrapper Class around Java boolean
 * 
 * @author Dominik Dingel
 * 
 */

public class PseudoCodeBoolean extends PseudoCodeObject {
	protected static final String TYPENAME = "Boolean";

	private boolean value;

	/**
	 * create new Boolean from literal
	 * 
	 * @param literal
	 */
	public PseudoCodeBoolean(boolean literal) {
		commandsforGr = new ArrayList<Stack<Object>>();
		commandsforGr.add(new Stack<Object>());
		this.setLiteralValue(literal);
	}

	/**
	 * create new Boolean from another Boolean
	 * 
	 * @param toSetFrom
	 */
	public PseudoCodeBoolean(PseudoCodeBoolean toSetFrom) {
		commandsforGr = new ArrayList<Stack<Object>>();
		commandsforGr.add(new Stack<Object>());
		this.setValue(toSetFrom);
	}

	/**
	 * creates new Boolean from graphicalrepresentation
	 * 
	 * @param gr
	 */
	public PseudoCodeBoolean(GraphicalRepresentation gr) {
		commandsforGr = new ArrayList<Stack<Object>>();
		commandsforGr.add(new Stack<Object>());
		allGr.add(gr);
		value = ((GraphicalRepresentationBoolean) gr).isSet();
	}

	/**
	 * get literal (java native) value
	 * 
	 * @return boolean value
	 */
	public boolean getLiteralValue() {
		return value;
	}

	/**
	 * set the inner member + change the outer representations
	 * 
	 * @param value
	 *            to set
	 */
	public void setLiteralValue(boolean value) {
		this.value = value;
		// operating in batchMode
		if (isInBatchRun) {
			commandsforGr.get(0).push(Boolean.valueOf(value));
		} else {
			for (GraphicalRepresentation gr : allGr) {
				((GraphicalRepresentationBoolean) gr).set(this.value);
			}
		}
	}

	/**
	 * @param value
	 *            to set
	 */
	public void setValue(PseudoCodeBoolean value) {
		this.setLiteralValue(value.getLiteralValue());
	}

	@Override
	public String toString() {
		String result = new String();
		if(this.value) {
			result += "true";
		}
		else {
			result += "false";
		}
		return result;
	}

	@Override
	public PseudoCodeObject set(String memberName, PseudoCodeObject value) {
		if (memberName.isEmpty()) {
			this.setValue((PseudoCodeBoolean) value);
		}
		return null;
	}
	
	@Override
	protected void runDelayedCommands() {
		for (GraphicalRepresentation gr : allGr) {
			((GraphicalRepresentationBoolean) gr)
					.set(((Boolean) this.commandsforGr.get(0).pop())
							.booleanValue());
		}
		this.commandsforGr.get(0).clear();
	}

	@Override
	public boolean equals(PseudoCodeObject toCheckAgainst) {
		try {
			return ((PseudoCodeBoolean) toCheckAgainst).getLiteralValue() == this.value;
		} catch (ClassCastException e) {
			return false;
		}
	}

	@Override
	public String getTypeName() {
		return PseudoCodeBoolean.TYPENAME;
	}

	public PseudoCodeBoolean and(PseudoCodeBoolean other) {
		return new PseudoCodeBoolean(this.getLiteralValue() && other.getLiteralValue());
	}
	public PseudoCodeBoolean or(PseudoCodeBoolean other) {
		return new PseudoCodeBoolean(this.getLiteralValue() || other.getLiteralValue());
	}
	public PseudoCodeBoolean not() {
		return new PseudoCodeBoolean(!this.getLiteralValue());
	}
	public PseudoCodeBoolean equal(PseudoCodeBoolean other) {
		return new PseudoCodeBoolean(this.getLiteralValue() == other.getLiteralValue());
	}
	public PseudoCodeBoolean notEqual(PseudoCodeBoolean other) {
		return this.equal(other).not();
	}
}
