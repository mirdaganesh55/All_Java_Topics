package com.org.star;

import java.util.Scanner;

public class ComStar2Rev {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = scanner.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j = a;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k = 1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=a;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=a-1;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
