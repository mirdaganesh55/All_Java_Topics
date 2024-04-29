package com.java.conversions;

import java.util.Scanner;

public class DeciToOctal {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter binary number : ");
		int num = scanner.nextInt();
		int sum = 0, pw = 1;
		while(num > 0) {
			int rem = num % 8;
			sum = sum + rem * pw;
			num/=8;
			pw = pw * 10;
		}
		System.out.println("Decimal "+sum);
	}
}
