package com.org.java1;

public class SwapTwoNum {
	static void swapping(int a, int b) {
		int c;
		System.out.println("Before Swapping a "+a);
		System.out.println("Before Swapping b "+b);
		c = a;
		a = b;
		b = c;
		System.out.println("After Swapping a "+a);
		System.out.println("After Swapping b "+b);
	}
	public static void main(String[] args) {
		swapping(12, 54);
	}
}
