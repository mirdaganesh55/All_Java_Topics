package com.java.pattern;

import java.util.Scanner;

public class XPattern {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = scanner.nextInt();
		
		for(int i = 0;i<a;i++) {
			for(int j = 0;j<a;j++) {
				if(i==j || i+j == a-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
