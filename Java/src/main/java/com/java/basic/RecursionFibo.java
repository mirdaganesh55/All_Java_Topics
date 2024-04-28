package com.java.basic;

import java.util.Scanner;

public class RecursionFibo {
	
	static int a = 0,b = 1;
	void printFibo(int num) {
		if(num > 2) {
			int sum = a + b;
			System.out.print(" "+sum);
			a = b;
			b = sum;
			printFibo(num-1);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scanner.nextInt();
		System.out.print(a+" "+b);
		RecursionFibo fibo = new RecursionFibo();
		fibo.printFibo(num);
	}

}
