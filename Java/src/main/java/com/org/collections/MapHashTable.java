package com.org.collections;

import java.util.Hashtable;
//
public class MapHashTable {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable<>();
		ht.put(101, "Ganesh");
		ht.put(112, "Rahul");
		ht.put(103, "Ayush");
//		ht.put(null, null);
		ht.put(9, "Jitu");
		ht.put("Java",3000);
		System.out.println(ht);
	}
}
