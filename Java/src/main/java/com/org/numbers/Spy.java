package com.org.numbers;

import java.util.Scanner;

public class Spy {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number : ");
		int a = scanner.nextInt();
		int t1 = a;
		int sum = 0;
		while(t1 > 0) {
			int rem = t1%10;
			sum = sum + rem;
			t1/=10;
		}
		int t2 = a;
		int mul = 1;
		while(t2>0) {
			int rem = t2%10;
			mul = mul * rem;
			t2/=10;
		}
		if(sum == mul) {
			System.out.println("Spy number "+a);
		}else {
			System.out.println("Not spy number "+a);
		}
	}

}
