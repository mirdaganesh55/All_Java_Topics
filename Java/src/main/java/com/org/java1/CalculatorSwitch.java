package com.org.java1;

import java.util.Scanner;

public class CalculatorSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select the Operation +,-,/,*");
		String operation = scanner.next();
		System.out.println("Enter an first number ");
		int a = scanner.nextInt();
		System.out.println("Enter an second number ");
		int b = scanner.nextInt();
		switch(operation) {
		case "+":
			System.out.println("Adding "+(a+b));
			break;
		case "-":
			System.out.println("Subtraction "+(a-b));
			break;
		case "*":
			System.out.println("Multiplication "+(a*b));
			break;
		case "/":
			System.out.println("Division "+(a/b));
			break;
		default:
			System.out.println("Invalid Input");
		}
	}
}
