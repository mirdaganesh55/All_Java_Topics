package com.java.pattern;

import java.util.Scanner;

public class Diagonals {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = scanner.nextInt();
		for(int i = 1;i<=a;i++) {
			for(int j = 1; j<=i;j++) {
				if(i>=2 && j <=(i-1)) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
