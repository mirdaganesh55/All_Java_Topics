package com.java.number;

import java.util.Scanner;

public class Krishnamurthy {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scanner.nextInt();//145
		int t1 =num;
		int sum = 0;
		while(t1 > 0) {
			int rem = t1%10;
			int mul = 1;
			for(int i =1;i<=rem;i++) {
				mul = mul * i;
			}
			sum = sum +mul;
			t1 /= 10;
		}
		if(num == sum) {
			System.out.println("Krishnamurthy "+num);
		}else {
			System.out.println("Not Krishnamurthy "+num);
		}
	}
}
