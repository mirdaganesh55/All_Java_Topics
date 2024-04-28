package com.org.java3;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = scanner.nextInt();
		if(a%2 == 0) {
			System.out.println("Even Number Found "+a);
		}else {
			System.out.println("Odd Number Found "+a);
		}
	}
}
