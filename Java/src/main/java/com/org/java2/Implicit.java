package com.org.java2;

public class Implicit {
	
	static void implicit() {
		byte b = 10;
		int i = b;
		char c = 'A';
		int b2 = c;
		System.out.println("byte "+b);
		System.out.println("int "+b2);
		System.out.println("int "+i);
	}
	public static void main(String[] args) {
		implicit();
	}
}
