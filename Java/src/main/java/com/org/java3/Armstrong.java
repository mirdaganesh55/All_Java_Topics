package com.org.java3;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scanner.nextInt();
		int t1 = num;
		int len = 0;
		while(t1>0) {
			t1 = t1/10;
			len++;
		}
		int t2 = num;
		int arm = 0;
		int rem;
		while(t2>0) {
			int mul = 1;
			rem = t2%10;
			for(int i = 1;i<=len;i++) {
				mul = mul * rem;
			}
			arm = arm + mul;
			t2 /= 10;
		}
		if(num == arm) {
			System.out.println("Armstrong Number "+num);
		}else {
			System.out.println("Not armstrong Number "+num);

		}
	}
}
