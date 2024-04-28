package com.java.number;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int x = scanner.nextInt();
		System.out.println("Enter the second number : ");
		int y = scanner.nextInt();
		int g = 0;
		for(int i =1;i<=x;i++) {
			if(x%i == 0 && y%i == 0) {
				g = i;
			}
		}
		System.out.println("GCD "+g);
	}
}	
