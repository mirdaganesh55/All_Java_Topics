package com.org.numbers;

import java.util.Scanner;

public class Neon {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number : ");
		int a = scanner.nextInt();
		int sq = a*a;
		int ans = 0;
		while(sq>0){
			int rem = sq%10;
			ans = ans + rem;
			sq /= 10;
		}
		if(a == ans) {
			System.out.println("Neon number "+a);
		}else {
			System.out.println("Not nean number "+a);
		}
	}
}
