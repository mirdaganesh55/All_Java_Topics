package com.org.java3;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		int temp = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number ");
		int a = scanner.nextInt();
		for(int i = 1;i<=a;i++) {
			if(a%i == 0) {
				temp++;
			}
		}
		if(temp == 2) {
			System.out.println("Prime number "+a);
		}else {
			System.out.println("Not a prime number "+a);
		}
	}
}
