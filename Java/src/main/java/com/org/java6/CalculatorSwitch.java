package com.org.java6;

import java.util.Scanner;

public class CalculatorSwitch {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number :");
		int a = scanner.nextInt();
		System.out.println("Enter second number :");
		int b = scanner.nextInt();
		System.out.println("Select operator +,-,*,/");
		String operator = scanner.next();
		switch(operator) {
		case "+":
			System.out.println("Adding the number "+(a+b));
			break;
		case "-":
			System.out.println("Subtraction the number "+(a-b));
			break;
		case "*":
			System.out.println("Multiplication the number "+(a*b));
			break;
		case "/":
			System.out.println("Division the number "+(a/b));
			break;
			default :
				System.out.println("Invalid operator...");
		}
	}
}
