package com.java.pattern;

import java.util.Scanner;

public class RectanglePattern {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the rows : ");
		int r = scanner.nextInt();
		System.out.println("Enter the colums : ");
		int c = scanner.nextInt();
		
		for(int i = 1; i<=r;i++) {	
			for(int j = 1;j<=c;j++) {
				if(i==r||i==1||j==c||j==1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
