package com.org.java6;

public class CompareObjects {
	
	public static void main(String[] args) {
		Double d = new Double(19.76);
		Long l = new Long(7654234);
		System.out.println(d.equals(l));
		System.out.println(d.equals(19.76));
	}
}
