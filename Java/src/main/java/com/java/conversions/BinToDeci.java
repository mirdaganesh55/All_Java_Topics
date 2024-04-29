package com.java.conversions;

import java.util.Scanner;

public class BinToDeci {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter binary number : ");
		int num = scanner.nextInt();
		int sum = 0,pw = 1;
		while(num>0) {
			int rem = num %10;
			sum = sum + rem*pw;
			num /= 10;
			pw = pw * 2;
		}
		System.out.println("Decimal number is : "+sum);
	}
}
