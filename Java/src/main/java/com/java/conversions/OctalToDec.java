package com.java.conversions;

import java.util.Scanner;

public class OctalToDec {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Octal number : ");
		int num = scanner.nextInt();
		int sum = 0,pw = 1;
		while(num > 0) {
			int rem = num%10;
			sum = sum + rem * pw;
			num /= 10;
			pw = pw * 8;
		}
		System.out.println("Decimal "+sum);
	}
}
