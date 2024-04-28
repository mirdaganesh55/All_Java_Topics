package com.org.java1;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number ");
		int factorial = 1;
		int a = scanner.nextInt();
		for(int i=1;i<=a;i++) {
			 factorial = i * factorial;
		}
		System.out.println("Factorial number is "+factorial);
	}
}
