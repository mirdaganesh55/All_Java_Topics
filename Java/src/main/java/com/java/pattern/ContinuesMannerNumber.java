package com.java.pattern;

import java.util.Scanner;

public class ContinuesMannerNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = scanner.nextInt();
		int count = 0;
		for(int i =1 ;i<=a;i++) {
			for(int j = 1;j<=i;j++) {
				count = count + 1;
				System.out.print(count);
			}
			System.out.println();
		}
	}
}	

