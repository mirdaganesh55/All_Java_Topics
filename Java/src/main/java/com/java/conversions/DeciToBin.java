package com.java.conversions;

import java.util.Scanner;

public class DeciToBin {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Decimal number : ");
		int num = scanner.nextInt();
		
		int sum = 0,pw = 1;
		while(num>0) {
			int rem = num % 2;
			sum = sum + rem * pw;
			num /= 2;
			pw = pw * 10;
		}
		System.out.println("Binary number is : "+sum);
	}
}
