package com.java.number;

import java.util.Scanner;

public class Neon {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scanner.nextInt();
		int sq = num * num;
		int sum = 0;
		while(sq > 0) {
			int rem = sq % 10 ;
			sum = sum + rem;
			sq /= 10;
		}
		if(num == sum) {
			System.out.println("Neon number "+num);
		}else {
			System.out.println("Not neon number "+num);
		}
	}
}
