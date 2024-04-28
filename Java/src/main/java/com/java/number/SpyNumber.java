package com.java.number;

import java.util.Scanner;

public class SpyNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scanner.nextInt();
		int t1 = num;
		int mul = 1;
		while(t1>0) {
			int rem = t1%10;
			mul = mul * rem;
			t1/=10;
		}
		int t2 = num;
		int sum = 0;
		while(t2>0) {
			int rem = t2%10;
			sum = sum + rem;
			t2 /=10;
		}
		if(mul == sum) {
			System.out.println("Spy number "+num);
		}
		else {
			System.out.println("Not spy number "+num);
		}
	}
}
