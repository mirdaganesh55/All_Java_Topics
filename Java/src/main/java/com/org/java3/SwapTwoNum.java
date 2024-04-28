package com.org.java3;

import java.util.Scanner;

public class SwapTwoNum {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number :");
		int a = scanner.nextInt();
		System.out.println("Enter second number :");
		int b = scanner.nextInt();
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("After Swapping a "+a);
		System.out.println("After Swapping b "+b);
	}
}
