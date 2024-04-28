package com.org.java1;

public class NestedIf {
	public static void main(String[] args) {
		int age = 16;
		int weight = 58;
		if(age>=18) {
			if(weight>=50) {
				System.out.println("You are eligible to donate blood");
			}else {
				System.out.println("You are not eligible to doante blood");
			}
		}else {
			System.err.println("Age Restricted");
		}
	}
}
