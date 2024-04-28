package com.org.java6;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number : ");
		int a = scanner.nextInt();
		int rev = 0;
		while(a > 0) {
			int rem = a % 10;
			rev = rev * 10 +rem;
			a /=10;
		}
		System.out.println("Reverse number is "+rev);
	}
}
