package com.org.java5;

import java.util.Scanner;

public class ComStar1Rev {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = scanner.nextInt();
		for(int i =1;i<=a;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i =1;i<=a;i++) {
			for(int j = a-1;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
