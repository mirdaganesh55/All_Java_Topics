package com.org.java2;

public class Explicit {
	static void explicit() {
		int a = 10;
		long l = 200;
		byte b = (byte)a;
		byte b2 = (byte)l;
		System.out.println("int "+a);
		System.out.println("byte "+b);
		System.out.println("long "+l);
		System.out.println("byte "+b2);
	}
	public static void main(String[] args) {
		explicit();
	}
}
