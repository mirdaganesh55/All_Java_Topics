package com.org.numbers;

import java.util.Scanner;

public class Duck {
	
	static boolean checkNumber(int a) {
		
		while(a > 0) {
			int rem = a%10;
			if(rem == 0) {
				return true;
			}
			a /= 10;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number : ");
		int x = scanner.nextInt();
		if(checkNumber(x) == true) {
			System.out.println("Duck number "+x);
		}else {
			System.out.println("Not duck number "+x);
		}
	}
}
