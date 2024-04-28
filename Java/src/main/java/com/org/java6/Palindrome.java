package com.org.java6;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number : ");
		int a = scanner.nextInt();
		int temp = a;
		int res = 0;
		while(temp > 0) {
			int rem = temp%10;
			res = res * 10 + rem;
			temp /= 10;
		}
		if(res == a) {
			System.out.println("Palindrome number "+a);
		}else {
			System.out.println("Not palindrome number "+a);
		}
	}
}
