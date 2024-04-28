package com.org.java6;

import java.util.Scanner;

public class SwpaWithout {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = scanner.nextInt();
		System.out.println("Enter second number : ");
		int b = scanner.nextInt();
		System.out.println("Before swapping a "+a);
		System.out.println("Before swapping b "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swapping a "+a);
		System.out.println("After swapping b "+b);
	}
}
