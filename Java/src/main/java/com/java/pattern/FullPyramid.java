package com.java.pattern;

import java.util.Scanner;

public class FullPyramid {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = scanner.nextInt();
		for(int i =1;i<=a;i++) {
			for(int j = a-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k = 1;k<(i*2);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
