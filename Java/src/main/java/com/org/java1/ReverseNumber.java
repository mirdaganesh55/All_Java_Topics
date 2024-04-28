package com.org.java1;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number ");
		int a = scanner.nextInt();
		int rev = 0;
		while(a > 0) {
			rev = rev * 10 + a%10;
			a /= 10;
		}
		System.out.println("Reverse the number "+rev);
	}
}
