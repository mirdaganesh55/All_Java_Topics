package com.org.star;

import java.util.Scanner;

public class Star1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = scanner.nextInt();
		for(int i = 1;i<=a;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
