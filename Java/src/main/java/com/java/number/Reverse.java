package com.java.number;

import java.util.Scanner;

public class Reverse {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scanner.nextInt();
		int ans = 0;
		while(num > 0) {
			int rem = num%10;
			ans = ans * 10 + rem ;
			num /= 10;
		}
		System.out.println("Reverve : "+ans);
	}
}
