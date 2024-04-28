package com.org.java6;

import java.util.Scanner;

public class LragestOfThreeNum {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = scanner.nextInt();
		System.out.println("Enter second number : ");
		int b = scanner.nextInt();
		System.out.println("Enter third number : ");
		int c = scanner.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println("Largest number is a "+a);
			}
		}
		else if(b>c) {
			if(b>a) {
				System.out.println("Largest number is b "+b);
			}
		}
		else {
			System.out.println("Largest number is c "+c);
		}
	}
}
