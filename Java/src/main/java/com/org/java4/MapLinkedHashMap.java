package com.org.java4;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public class MapLinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap lhm = new LinkedHashMap<>();
		lhm.put(101, "Ganesh");
		lhm.put(112, "Rahul");
		lhm.put(103, "Ayush");
		lhm.put(null, null);
		lhm.put(9, "Jitu");
		lhm.put("Java",3000);
		System.out.println(lhm);
		
		LinkedHashSet lhs = new LinkedHashSet(lhm.entrySet());
		LinkedHashSet lh = new LinkedHashSet();
		Iterator i = lhs.iterator();
		while(i.hasNext()) {
//			System.out.println(i.next());
			Entry e = (Entry)i.next();
			System.out.println(e.getKey() +" "+ e.getValue());
		}
	}
}
