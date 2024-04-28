package com.org.java3;

import java.util.Scanner;

public class FibonacciRecursion {
	static int b = 0,c=1,d;
	void checkFibo(int a) {
		if(a>=1) {
			d = b + c;
			System.out.print(" "+c);
			b = c;
			c = d;
			checkFibo(a-1);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = scanner.nextInt();
		System.out.print(b+" "+c);
		FibonacciRecursion recursion = new FibonacciRecursion();
		recursion.checkFibo(a);
	}
}
