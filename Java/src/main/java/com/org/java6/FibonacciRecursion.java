package com.org.java6;

import java.util.Scanner;


public class FibonacciRecursion {
	
	static int a = 0,b=1;
	void  printNumber(int num) {
		if(num>2) {
			int res = a + b;
			System.out.print(" "+res);
			a = b;
			b = res;
			printNumber(num-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		System.out.print(a+" "+b);
		FibonacciRecursion recursion = new FibonacciRecursion();
		recursion.printNumber(num);
	}
}
