package com.java.basic;

public class CompareTwoObjects {
	
	public static void main(String[] args) {
		Double double1 = new Double(123.432);
		Integer integer = new Integer(208);
		Integer integer2 = new Integer(208);
		System.out.println(double1.equals(integer));//false
		System.out.println(double1.equals(123.432));//true
		System.out.println(double1.hashCode());
		System.out.println(integer.hashCode());
		System.out.println(integer2.hashCode());
	}
}
