package com.org.java2;

public class OverLoadMeth {
	
	int add(int a, int b) {
		return a+b;
	}
	int add(int a, int b , int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		OverLoadMeth loadMeth = new OverLoadMeth();
		System.out.println(loadMeth.add(10, 20));
		System.out.println(loadMeth.add(10, 20, 30));
	}
}
