package com.java.basic;

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scanner.nextInt();
		int t1 = num,len = 0;
		while(t1>0) {
			t1/=10;
			len++;
		}
		int t2 = num;
		int arm = 0;
		while(t2>0) {
			int rem = t2%10;
			int mul = 1;
			for(int i = 1; i<=len;i++) {
				mul = mul * rem;
			}
			arm = arm + mul;
			t2 /=10;
		}
		if(arm == num) {
			System.out.println("Armstrong "+num);
		}else {
			System.out.println("Not Arm "+num);
		}
	}
}
