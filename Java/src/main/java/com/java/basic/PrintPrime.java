package com.java.basic;

import java.util.Scanner;

public class PrintPrime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scanner.nextInt();
		for(int i = 2;i<=num;i++) {
			int temp = 0;
			for(int j = 2;j<i-1;j++) {
				if(i%j == 0) {
					temp++;
				}
			}
			if (temp == 0) {
				System.out.println(i);
			}
		}
	}
}
