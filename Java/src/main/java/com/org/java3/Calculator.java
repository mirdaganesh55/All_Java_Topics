package com.org.java3;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = scanner.nextInt();
		System.out.println("Enter second number : ");
		int b = scanner.nextInt();
		System.out.println("Select Operators +,-,/,*");
		String operation = scanner.next();
		switch(operation) {
		case "+":
			System.out.println("After adding a and b we get "+(a+b));
			break;
		case "-":
			System.out.println("After subtration a and b we get "+(a-b));
			break;
		case "/":
			System.out.println("After division a and b we get "+(a/b));
			break;
		case "*":
			System.out.println("After Multiplication a and b we get "+(a*b));
			break;
			default :
				System.out.println("Invalid operators");
		}
	}
}
