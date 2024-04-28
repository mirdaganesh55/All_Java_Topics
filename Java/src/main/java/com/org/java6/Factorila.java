package com.org.java6;

import java.util.Scanner;

public class Factorila {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number : ");
		int a = scanner.nextInt();
		int res = 1;
		for(int i= 1;i<=a;i++) {
			res = res * i;
		}
		System.out.println("Factorial of "+a+" is "+res);
	}
}
