package com.java.basic;

import java.util.Scanner;

public class RecursionFactorila {

	int mul = 1;
	int checkNumber(int num ) {
		if(num > 0) {
			System.out.println(mul);
			mul = mul * num;
			checkNumber(num-1);
		}
		return mul;
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scanner.nextInt();
		RecursionFactorila factorila = new RecursionFactorila();
		System.out.println(factorila.checkNumber(num));
	}
}
