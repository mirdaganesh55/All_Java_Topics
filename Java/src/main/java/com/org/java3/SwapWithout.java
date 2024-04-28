package com.org.java3;

import java.util.Scanner;

public class SwapWithout {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int a = scanner.nextInt();
		System.out.println("Enter Second number");
		int b = scanner.nextInt();
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a);
		System.out.println(b);
	}
}
