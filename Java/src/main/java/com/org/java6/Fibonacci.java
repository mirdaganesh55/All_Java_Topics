package com.org.java6;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = 0,b=1,c;
		c = scanner.nextInt();
		System.out.print(a +" "+b);
		for(int i =2;i<c;i++) {
			int res = a + b;
			System.out.print(" "+res);
			a = b;
			b = res;
		}
	}
}
