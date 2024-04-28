package com.org.java5;

import java.util.Scanner;

public class Star2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = scanner.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j = a-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k = 1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
