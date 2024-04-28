package com.java.number;

import java.util.Scanner;

public class Duck {
	
	static boolean checkNumber(int a) {
		while(a >0) {
			int rem = a%10;
			if(rem == 0) {
				return true;
			}
			a/=10;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scanner.nextInt();
		if(checkNumber(num) == true) {
			System.out.println("Duck number "+num);
		}
		else {
			System.out.println("Not duck number "+num);
		}
	}
}
