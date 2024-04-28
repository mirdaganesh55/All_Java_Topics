package com.org.java6;

import java.util.Scanner;

public class LargestOfTwoNum {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a first number : ");
		int a = scanner.nextInt();
		System.out.println("Enter a second number : ");
		int b = scanner.nextInt();
		if(a>b) {
			System.out.println("Largest number is a "+a);
		}else {
			System.out.println("Largest number is b "+b);
		}
	}
}
