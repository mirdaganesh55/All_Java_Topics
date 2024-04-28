package com.org.java5;

import java.util.Scanner;

public class RevStar1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = scanner.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j = a;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
