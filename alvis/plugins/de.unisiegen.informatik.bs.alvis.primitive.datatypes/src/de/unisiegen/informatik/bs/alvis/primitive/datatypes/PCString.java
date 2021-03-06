/*
 * Copyright (c) 2011 Dominik Dingel
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

package de.unisiegen.informatik.bs.alvis.primitive.datatypes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


/**
 * @author Dominik Dingel
 * 
 */

public class PCString extends PCObject {
	public static final String TYPENAME = "String";

	private String value;

	/**
	 * 
	 * @param literal to create String from
	 */
	public PCString(String literal) {
		value = literal;
	}

	/**
	 * 
	 * @return literal String
	 */
	public String getLiteralValue() {
		return value;
	}

	/**
	 * 
	 * @param value set literal from String
	 */
	public void setLiteralValue(String value) {
		this.value = value;
	}

	/**
	 * 
	 * @param value set from another PC String
	 */
	public void setValue(PCString value) {
		this.value = value.getLiteralValue();
	}

	@Override
	public String toString() {
		return value;
	}

	@Override
	public boolean equals(PCObject toCheckAgainst) {
		if (null == toCheckAgainst)
			return false;
		if (this == localNull
				&& (toCheckAgainst == localNull || toCheckAgainst == PCObject.getNull()))
			return true;
		if (!(toCheckAgainst instanceof PCString))
			return false;
		PCString other = (PCString) toCheckAgainst;
		return (value == null) ? other.value == null : other.value.equals(value);
	}

	public PCString _add_(PCString other) {
		return new PCString(this.getLiteralValue() + other.getLiteralValue());
	}

	public PCString _add_(PCObject other) {
		return new PCString(this.getLiteralValue() + other.toString());
	}

	public PCBoolean _equal_(PCString other) {
		return new PCBoolean(this.equals(other));
	}

	public PCBoolean _notEqual_(PCString other) {
		return this._equal_(other)._not_();
	}
	
	public List<String> getMethods() {
		String[] methods = { "add", "equal", "notEqual" };
		return Arrays.asList(methods);
	}

	@Override
	public HashMap<String, String> getHelp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PCObject set(String memberName, PCObject value) {
		// TODO Auto-generated method stub
		return null;
	}
}
