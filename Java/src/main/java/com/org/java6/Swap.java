package com.org.java6;

import java.util.Scanner;

public class Swap {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = scanner.nextInt();
		System.out.println("Enter second number : ");
		int b = scanner.nextInt();
		System.out.println("Before swapping a "+a);
		System.out.println("Before swapping b "+b);
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("After swapping a "+a);
		System.out.println("After swapping b "+b);
	}
}
