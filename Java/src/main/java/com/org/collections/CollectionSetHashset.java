package com.org.collections;

import java.util.HashSet;
import java.util.Iterator;
// Insertion order is not maintained
public class CollectionSetHashset {
	public static void main(String[] args) {
		HashSet hs = new HashSet<>();
		hs.add(10);
		hs.add(10.87);
		hs.add("Ganu");
		hs.add('A');
		hs.add(null);
		Iterator ih = hs.iterator();
		while(ih.hasNext()) {
			System.out.println(ih.next());
		}
	}
}
