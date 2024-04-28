package com.org.java4;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionListArrayList {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(10);
		al.add(22.3);
		al.add("Ganu");
		al.add('A');
		al.add(null);
//		System.out.println(al.size());//5
		
		for(int i = 0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("----------------------");
		for(Object o:al) {
			System.out.println(o);
		}
		System.out.println("----------------------");
		Iterator i = al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
