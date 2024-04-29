package com.org.concepts;

public class AutoUnboxing {
	public static void main(String[] args) {
		Integer integer = new Integer(101);
		int i = integer.intValue();
		System.out.println("ClassObject "+integer);
		System.out.println("AUB "+i);
	}
}
