package com.java.pattern;

import java.util.Scanner;

public class NumLastSecond {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = scanner.nextInt();
		for(int i =1 ;i<=a;i++) {
			for(int j = i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
