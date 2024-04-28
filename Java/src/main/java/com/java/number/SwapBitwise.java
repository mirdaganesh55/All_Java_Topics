package com.java.number;

import java.util.Scanner;

public class SwapBitwise {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int x = scanner.nextInt();
		System.out.println("Enter the second number : ");
		int y = scanner.nextInt();
		System.out.println("Before Swap"+x);
		System.out.println("Before Swap"+y);
		x = x^y;
		y = x^y;
		x = x^y;
		System.out.println("After Swap"+x);
		System.out.println("After Swap"+y);
	}
}
