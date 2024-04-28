package com.org.java6;

import java.util.Scanner;

public class Armstrongnumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number : ");
		int a = scanner.nextInt();
		int t1 = a;
		int len = 0;
		while(t1 > 0) {
			t1 /= 10; 
			len++;
		}
		int t2 = a;
		int arm = 0;
		while(t2 > 0) {
			int rem = t2%10;
			int mul = 1;
			for(int i =1 ; i<=len;i++) {
				mul = mul * rem;
			}
			t2 /= 10;
			arm = arm + mul;
		}
		if(arm == a) {
			System.out.println("arm");
		}else {
			System.out.println("not arm");
		}
	}
	
}
