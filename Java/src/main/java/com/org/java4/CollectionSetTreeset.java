package com.org.java4;

import java.util.Iterator;
import java.util.TreeSet;

public class CollectionSetTreeset {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet<>();
		ts.add(10);
		ts.add(54);
		ts.add(9);
		ts.add(11);
		
//		ts.add("Ganu");
//		ts.add('A');
//		ts.add(null);
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
