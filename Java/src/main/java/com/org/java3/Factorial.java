package com.org.java3;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = scanner.nextInt();
		int temp = 1;
		for(int i =1;i<=a;i++) {
			temp *=i;
		}
		System.out.println("Factorial of "+a+" is "+temp);
	}
}
