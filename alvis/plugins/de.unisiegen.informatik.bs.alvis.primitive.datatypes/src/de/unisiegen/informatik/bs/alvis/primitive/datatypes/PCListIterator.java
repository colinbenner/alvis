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

import java.util.Iterator;

/**
 * 
 * @author Dominik Dingel
 *
 * @param <E> Type used for stored Objects in the List
 */

public class PCListIterator<E extends PCObject> implements Iterator<E> {
	// reference to Object on which we are currently working
	private PCList<E> parent;
	// index pointer with in the list
	private int index;
	
	/**
	 * create Iterator from Parent, set index to -1
	 * @param parent
	 */
	public PCListIterator(PCList<E> parent) {
		this.parent = parent;
		this.index = -1;
	}
	
	/**
	 * is there a next item in our collection
	 */
	@Override
	public boolean hasNext() {
		if(index < parent.size()-1) {
			return true;
		}
		return false;
	}
	
	/**
	 * we don't support removing a object from a list with a iterator!
	 */
	@Override
	public void remove() throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * retrieve next object, throws out of bound exception
	 */
	@Override
	public E next() {
		index++;
		return parent.get(index);
	}
	
}
