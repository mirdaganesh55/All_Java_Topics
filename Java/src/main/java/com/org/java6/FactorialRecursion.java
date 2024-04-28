package com.org.java6;

import java.util.Scanner;

public class FactorialRecursion {
	
	int temp = 1;
	 int recursionNumber(int x) {
		if(x>1) {
			temp *= x;
			recursionNumber(x-1);
		}
		return temp;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number : ");
		int a = scanner.nextInt();
		FactorialRecursion factorialRecursion = new FactorialRecursion();
		int ans = factorialRecursion.recursionNumber(a);
		System.out.println(ans);
	}
}
