package com.org.java1;

public class LargestOfTwo {
	
	static void largeNumCheck(int a , int b) {
		if(a > b) {
			System.out.println("Largest Number is "+a);
		}else {
			System.out.println("Largest Number is "+b);
		}
	}
	public static void main(String[] args) {
		LargestOfTwo.largeNumCheck(91, 80);
	}
}
