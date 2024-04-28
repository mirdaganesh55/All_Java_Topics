package com.org.java3;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scanner.nextInt();
		int temp = num;
		int rev = 0;
		while(num>0) {
			rev = rev * 10 + num%10;
			num /= 10;
		}
		if (temp == rev) {
			System.out.println("Palindrome number "+rev);
		}else {
			System.out.println("Not a palindrome number "+rev);
		}
	}
}
