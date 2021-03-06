package de.unisiegen.informatik.bs.alvis.graph.datatypes;

import java.lang.reflect.Method;
import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<PCObject> allDatatypesInThisPlugin = new ArrayList<PCObject>();

		allDatatypesInThisPlugin.add(new PCEdge());
		allDatatypesInThisPlugin.add(new PCGraph());
		allDatatypesInThisPlugin.add(new PCVertex());
		
		for(PCObject temp : allDatatypesInThisPlugin)  {
			System.out.println("~~~~~~~~~~~~");
			System.out.println(temp.getClass().getName());
			System.out.println(temp.getClass().getPackage().getName());
			System.out.println("~~");
			for(Method meth : temp.getClass().getDeclaredMethods()) {
				System.out.println(meth.getName());
			}
			System.out.println("~~");
			temp.getClass().getPackage().getName();
			System.out.println(PCObject.getNull());
			System.out.println(temp.toString());
			System.out.println(temp.getMethods());
			System.out.println();
		}
//		System.out.println(PseudoCodeEdge.getNull());
	}

}
