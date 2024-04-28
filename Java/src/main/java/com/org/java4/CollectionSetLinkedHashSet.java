package com.org.java4;

import java.util.Iterator;
import java.util.LinkedHashSet;
//Insertion order is maintained

public class CollectionSetLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet<>();
		lhs.add(10);
		lhs.add(10.87);
		lhs.add("Ganu");
		lhs.add('A');
		lhs.add(null);
		Iterator i = lhs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
