package com.java.basic;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scanner.nextInt();
		int t1 = num;
		int sum = 0;
		while(t1>0) {
			int rem = t1%10;
			sum = sum * 10 + rem;
			t1 /= 10;
		}
		if(sum == num) {
			System.out.println("Palindrome "+num);
		}else {
			System.out.println("Not palindrome "+num);
		}
	}
}
