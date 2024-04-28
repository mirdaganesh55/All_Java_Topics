package com.org.java1;

public class SwapWithout {
	void swapping(int a, int b) {
		//a = 5 b = 3
		System.out.println("Before Swapping a "+a);
		System.out.println("Before Swapping b "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swapping a "+a);
		System.out.println("After Swapping b "+b);
	}
	public static void main(String[] args) {
		SwapWithout swapWithout = new SwapWithout();
		swapWithout.swapping(5, 3);
	}
}
