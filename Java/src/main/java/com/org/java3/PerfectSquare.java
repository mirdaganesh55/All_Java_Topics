package com.org.java3;

import java.util.Scanner;

public class PerfectSquare {
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter number ");
		int a = scanner.nextInt();
		for(int i =1; i<=a;i++) {
			if(i*i == a) {
				System.out.println("Given number is square of "+i);
				return;
			}
		}
		System.out.println("Not");
	}
}
