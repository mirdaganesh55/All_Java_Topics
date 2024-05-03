package com.java.pattern;

import java.util.Scanner;

public class LastNumberPattern {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = scanner.nextInt();
		for(int i =1 ;i<=a;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(j);
			}
			for(int k = i-1;k>=1;k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
