package com.org.java3;

import java.util.Scanner;

public class FactorialRecursion {
	
	int temp = 1;
	int calcFact(int a) {
		if(a>1) {
			temp *= a;
			calcFact(a-1);
		}
		return temp;
	}
	public static void main(String[] args) {
		int res;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scanner.nextInt();
		FactorialRecursion recursion = new FactorialRecursion();
		res = recursion.calcFact(num);
		System.out.println("Factorial is "+res);
	}
}
