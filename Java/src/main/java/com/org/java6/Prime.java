package com.org.java6;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number : ");
		int a = scanner.nextInt();
		int temp = 0;
		for(int i =1; i<=a;i++) {
			if(a%i == 0) {
				temp++;
			}
		}
		if(temp == 2) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not Prime number");
		}
	}
}
