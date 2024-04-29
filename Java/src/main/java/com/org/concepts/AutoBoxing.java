package com.org.concepts;

public class AutoBoxing {
	public static void main(String[] args) {
		int i = 10;
		Integer i1 = Integer.valueOf(i);
		Integer i2 = i;
		System.out.println("PD "+i);
		System.out.println("AB "+i2);
	}
}
