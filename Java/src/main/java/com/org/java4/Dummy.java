package com.org.java4;

import java.util.ArrayList;

public class Dummy {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(12);
		al.add("Ganu");
		al.add(54);
		System.out.println(al);
		for(int i = 0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		for(Object o:al) {
			System.out.println(o);
		}
	}
}
