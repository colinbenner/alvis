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
package de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import org.eclipse.swt.graphics.Font;

/**
 * 
 * class for saving alvis graph details
 * 
 * @author Frank Weiler
 * 
 */
public class AlvisSave {

	private HashMap<AlvisGraphNode, Point> remPos;
	private ArrayList<AlvisGraphConnection> allConnections;
	private ArrayList<ArrayList<AlvisGraphNode>> circles, trees;
	private int globalNodeId;
	private int globalConId;
	/**
	 * amount of circles in graph
	 */
	private AlvisGraphNode startNode, endNode;
	/**
	 * makes graph fit in eclipse view,limits graph size
	 */
	private double limiter;
	/**
	 * the global connection color counter
	 */
	private int connectionColor;
	/**
	 * used for building connections
	 */
	private AlvisGraphNode connectNode;

	private int zoomCounter;
	private double zoomFactor;

	/**
	 * the constructor
	 * 
	 * @param graph
	 *            the graph, which alvisSave administers
	 */
	public AlvisSave() {

		allConnections = new ArrayList<AlvisGraphConnection>();
		remPos = new HashMap<AlvisGraphNode, Point>();
		startNode = null;
		endNode = null;
		connectNode = null;
		limiter = 0.8;
		zoomFactor = 1.4;
		globalNodeId = 0;
		globalConId = 0;
		connectionColor = 1;
		zoomCounter = 1;
		circles = new ArrayList<ArrayList<AlvisGraphNode>>();
		trees = new ArrayList<ArrayList<AlvisGraphNode>>();

	}

	/**
	 * the constructor
	 * 
	 * @param graph
	 *            the graph, where nodes will be shown
	 * @param seri
	 *            the data to rebuild graph
	 */
	public AlvisSave(AlvisGraph graph, AlvisSerialize seri) {
		this();

		// This replaces the current admin with the new one
		graph.admin = this;

		this.globalNodeId = seri.getGlobalNodeId();
		this.globalConId = seri.getGlobalConId();

		this.zoomCounter = seri.getZoomCounter();

		int fontSize = 4 + (int) (6 * Math.pow(2, zoomCounter));
		int gcFontSize = Math.min(48, fontSize);
		Font gnFont = new Font(null, "gn", fontSize, 1);
		Font gcFont = new Font(null, "gc", gcFontSize, 1);

		for (int i = 0; i < seri.getNodeId().length; i++) {
			int id = seri.getNodeId()[i];
			String text = seri.getNodeText()[i];
			// Image image;
			// try {
			// String myText = (text.equals("") ? "" + id : text);
			// image = GraphEditor.makeGraphImage(myText);
			// } catch (IOException ioe) {
			// image = null;
			// }
			Point point = new Point(seri.getNodeX()[i], seri.getNodeY()[i]);

			AlvisGraphNode gn = new AlvisGraphNode(graph, text, null, id);
			addNode(gn, point);
			gn.setLocation(point.x, point.y);
			gn.setFont(gnFont);

			if (id == seri.getStartId()) {
				startNode = gn;
				graph.setStartNode(gn);
			}
			if (id == seri.getEndId()) {
				endNode = gn;
				graph.setEndNode(gn);
			}
		}

		for (int i = 0; i < seri.getConId().length; i++) {
			int id = seri.getConId()[i];
			int style = seri.getConStyle()[i];
			int weight = seri.getConWeight()[i];
			AlvisGraphNode node1 = getNode(seri.getConNode1()[i]);
			AlvisGraphNode node2 = getNode(seri.getConNode2()[i]);

			AlvisGraphConnection gc = new AlvisGraphConnection(graph, style,
					node1, node2, id, weight);
			gc.setConnectionColor(seri.getConColor()[i]);
			gc.setFont(gcFont);
			gc.setLineWidth((this.zoomCounter <= 0) ? 1 : (int) Math.pow(
					this.zoomFactor, this.zoomCounter + 2));
			addConnection(gc);
		}

	}

	public int getNodeId() {
		return (globalNodeId + 1);
	}
	

	public int getConId() {
		return (globalConId + 1);
	}

	public int getAmountOfGraphs() {
		int singles = 0;
		for (AlvisGraphNode gn : getAllNodes()) {
			if (gn.getConnectionColor() == 0) {
				singles = 1;
				break;
			}
		}
		return (circles.size() + trees.size() + singles);
	}

	public void resetSubGraphs() {
		for (AlvisGraphNode gn : getAllNodes()) {
			gn.setConnectionColor(0);
		}
		for (AlvisGraphConnection gc : getAllConnections()) {
			gc.setConnectionColor(0);
		}
		circles.clear();
		trees.clear();
		connectionColor = 1;

	}

	protected void increaseZoomCounter() {
		zoomCounter++;
	}

	protected void decreaseZoomCounter() {
		zoomCounter--;
	}

	protected int getZoomCounter() {
		return zoomCounter;
	}

	public void setStartNode(AlvisGraphNode startNode) {
		this.startNode = startNode;
	}

	public AlvisGraphNode getStartNode() {
		return startNode;
	}

	public void setEndNode(AlvisGraphNode endNode) {
		this.endNode = endNode;
	}

	public AlvisGraphNode getEndNode() {
		return endNode;
	}

	public void setLimiter(double limiter) {
		this.limiter = limiter;
	}

	public double getLimiter() {
		return limiter;
	}

	public boolean addConnection(AlvisGraphConnection connection) {
		return allConnections.add(connection);
	}

	public boolean removeConnection(AlvisGraphConnection connection) {
		return allConnections.remove(connection);
	}

	public void removeConnection(int connectionIndex) {
		AlvisGraphConnection connection = getAllConnections().get(
				connectionIndex);
		if (connection.getFirstNode().getConnections().size() == 1) {
			connection.getFirstNode().setConnectionColor(0);
		}
		if (connection.getSecondNode().getConnections().size() == 1) {
			connection.getSecondNode().setConnectionColor(0);
		}
		allConnections.remove(connectionIndex);
	}

	public ArrayList<AlvisGraphConnection> getAllConnections() {
		return allConnections;
	}

	public boolean addCircle(ArrayList<AlvisGraphNode> circle) {
		return circles.add(circle);
	}

	public boolean removeCircle(ArrayList<AlvisGraphNode> circle) {
		return circles.remove(circle);
	}

	public void removeCircle(int circleIndex) {
		circles.remove(circleIndex);
	}

	public ArrayList<ArrayList<AlvisGraphNode>> getCircles() {
		return circles;
	}

	public boolean addTree(ArrayList<AlvisGraphNode> tree) {
		return trees.add(tree);
	}

	public boolean removeTree(ArrayList<AlvisGraphNode> tree) {
		return trees.remove(tree);
	}

	public void removeTree(int treeIndex) {
		trees.remove(treeIndex);
	}

	public ArrayList<ArrayList<AlvisGraphNode>> getTrees() {
		return trees;
	}

	public void setSingle(AlvisGraphNode node) {
		node.setConnectionColor(0);
	}

	public void setSingles() {
		for (AlvisGraphNode gn : getAllNodes()) {
			if (gn.getConnections().isEmpty()) {
				gn.setConnectionColor(0);
			}
		}
	}

	public ArrayList<AlvisGraphNode> getSingles() {
		ArrayList<AlvisGraphNode> singles = new ArrayList<AlvisGraphNode>();
		for (AlvisGraphNode gn : getAllNodes()) {
			if (gn.getConnectionColor() == 0) {
				singles.add(gn);
			}
		}
		return singles;
	}

	public void addNode(AlvisGraphNode node) {
		remPos.put(node, new Point());
	}

	public void removeNode(AlvisGraphNode node) {
		remPos.remove(node);
	}

	public void addNode(AlvisGraphNode node, Point point) {
		remPos.put(node, point);
	}

	public void setPosition(AlvisGraphNode node, Point point) {
		remPos.put(node, point);
	}

	public HashMap<AlvisGraphNode, Point> getRemPos() {
		return remPos;
	}

	public Set<AlvisGraphNode> getAllNodes() {
		return remPos.keySet();
	}

	public AlvisGraphConnection getConnection(int id) {
		for (AlvisGraphConnection gc : getAllConnections()) {
			if (id == gc.getId())
				return gc;
		}
		return null;
	}
	
	public AlvisGraphNode getNode(int id) {
		for (AlvisGraphNode gn : getAllNodes()) {
			if (id == gn.getId())
				return gn;
		}
		return null;
	}

	public void saveNodes() {
		for (AlvisGraphNode gn : getAllNodes()) {
			getRemPos().get(gn).setLocation(gn.getLocation().x,
					gn.getLocation().y);
		}
	}

	public void loadNodes() {
		for (AlvisGraphNode gn : getAllNodes()) {
			gn.setLocation(remPos.get(gn).x, remPos.get(gn).y);
		}
	}

	public AlvisSave clone(AlvisGraph parent) {
		AlvisSave dolly = new AlvisSave();

		dolly.limiter = this.getLimiter();
		dolly.globalNodeId = this.globalNodeId;
		dolly.globalConId = this.globalConId;
		dolly.zoomCounter = this.zoomCounter;

		int fontSize = 4 + (int) (6 * Math.pow(2, zoomCounter));
		int gcFontSize = Math.min(48, fontSize);
		Font gnFont = new Font(null, "gn", fontSize, 1);
		Font gcFont = new Font(null, "gc", gcFontSize, 1);

		// add graph nodes to dolly:
		AlvisGraphNode newGn;
		for (AlvisGraphNode gn : this.getAllNodes()) {
			newGn = new AlvisGraphNode(parent, gn.getText(), gn.getImage(),
					gn.getId());
			newGn.setFont(gnFont);

			dolly.addNode(newGn, new Point(gn.getLocation().x,
					gn.getLocation().y));

			if (this.getStartNode() != null && gn.equals(this.getStartNode())) {
				dolly.startNode = newGn;
				newGn.markAsStartNode();
			} else if (this.getEndNode() != null
					&& gn.equals(this.getEndNode())) {
				dolly.endNode = newGn;
				newGn.markAsEndNode();
			}

			newGn.setLocation(gn.getLocation().x, gn.getLocation().y);
		}

		// add graph connections to dolly
		AlvisGraphConnection newGc;
		AlvisGraphNode n1, n2;
		for (AlvisGraphConnection gc : this.getAllConnections()) {
			n1 = null;
			n2 = null;
			for (AlvisGraphNode gn : dolly.getAllNodes()) {
				if (n1 == null && gn.equals(gc.getFirstNode())) {
					n1 = gn;
				}
				if (n2 == null && gn.equals(gc.getSecondNode())) {
					n2 = gn;
				}
				if (n1 != null && n2 != null) {
					newGc = new AlvisGraphConnection(parent, gc.getStyle(), n1,
							n2, gc.getId(), gc.getAlvisWeight());
					newGc.setFont(gcFont);
					dolly.addConnection(newGc);
					break;
				}
			}
		}

		return dolly;
	}

	public AlvisSerialize serialize() {
		AlvisSerialize seri = new AlvisSerialize(remPos, allConnections,
				startNode, endNode, globalNodeId, globalConId, zoomCounter);
		return seri;
	}

	public int getConnectionColor() {
		return connectionColor;
	}

	public void setConnectionColor(int connectionColor) {
		this.connectionColor = connectionColor;
	}

	public void setConnectNode(AlvisGraphNode connectNode) {
		this.connectNode = connectNode;
	}

	public AlvisGraphNode getConnectNode() {
		return connectNode;
	}

	public double getZoomFactor() {
		return zoomFactor;
	}

	public void setZoomFactor(double zoomFactor) {
		this.zoomFactor = zoomFactor;
	}

	public int requestNodeId() {
		globalNodeId++;
		return globalNodeId;
	}

	public int requestConId() {
		globalConId++;
		return globalConId;
	}

}
