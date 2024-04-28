package com.java.number;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scanner.nextInt();
		for(int i =1;i<=num;i++) {
			if(i*i == num) {
				System.out.println("Perfect sqaure "+i);
				return;
			}
		}
		System.out.println("Not");
	}
}
