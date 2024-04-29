package com.org.collections;

import java.util.Enumeration;
import java.util.Vector;

public class CollectionListVector {
	
	public static void main(String[] args) {
		Vector v = new Vector<>();
		v.add(10);
		v.add(10.87);
		v.add("Ganu");
		v.add('A');
		v.add(null);
		System.out.println(v);  
		System.out.println("-------------------");
		for(int i = 0; i <v.size();i++) {
			System.out.println(v.get(i));
		}
		System.out.println("-------------------");
		for(Object o:v) {
			System.out.println(o);
		}
		System.out.println("-------------------");
		v.removeElement(10);
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
