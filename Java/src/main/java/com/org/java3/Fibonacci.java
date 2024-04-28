package com.org.java3;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scanner.nextInt();
		int a=0, b =1, c;
		System.out.print(a+" "+b);
		for(int i = 1;i<=num;i++) {
			c = a +b;
			System.out.print(" "+c);
			a = b;
			b = c;
		}
	}
}
