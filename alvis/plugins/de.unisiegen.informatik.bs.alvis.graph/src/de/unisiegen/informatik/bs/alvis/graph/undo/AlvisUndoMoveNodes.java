/*
 * Copyright (c) 2011 Frank Weiler
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
package de.unisiegen.informatik.bs.alvis.graph.undo;

import java.util.ArrayList;

import org.eclipse.draw2d.Animation;
import org.eclipse.swt.graphics.Point;

import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraph;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraphNode;

/**
 * undoes moving nodes
 * 
 * @author Frank Weiler
 * 
 */
public class AlvisUndoMoveNodes implements AlvisGraphUndo {

	private boolean dirty;
	private ArrayList<AlvisGraphNode> gns;
	private ArrayList<Point> oldPositions;

	public AlvisUndoMoveNodes(boolean wasDirty, ArrayList<AlvisGraphNode> gns) {

		dirty = wasDirty;
		this.gns = gns;
		this.oldPositions = new ArrayList<Point>();

		for (AlvisGraphNode gn : gns) {
			Point p = new Point(gn.getLocation().x, gn.getLocation().y);
			oldPositions.add(p);
		}

	}

	@Override
	public void execute(AlvisGraph graph) {

		Animation.markBegin();

		ArrayList<Point> redoPositions = new ArrayList<Point>();
		for (int i = 0; i < gns.size(); i++) {
			
			Point p = new Point(gns.get(i).getLocation().x, gns.get(i)
					.getLocation().y);
			redoPositions.add(p);
			
			gns.get(i)
					.setLocation(oldPositions.get(i).x, oldPositions.get(i).y);
			
		}
		oldPositions = redoPositions;

		Animation.run(200);

	}

	@Override
	public AlvisGraphUndo invert() {
		return this;
	}

	@Override
	public boolean willBeDirty() {
		return dirty;
	}

	@Override
	public void setWillBeDirty(boolean dirty) {
		this.dirty = dirty;
	}

}