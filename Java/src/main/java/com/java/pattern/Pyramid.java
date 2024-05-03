package com.java.pattern;

import java.util.Scanner;

public class Pyramid {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = scanner.nextInt();
		for(int i =1;i<=a;i++) {
			for(int j = a;j>=1;j--) {
				if(j>i) {
					System.out.print(" ");
				}else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
		System.out.println("------------Meth 2--------------");
		for(int i =1;i<=a;i++) {
			for(int j =a-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k = 1;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
