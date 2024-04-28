package com.java.number;

import java.util.Scanner;

public class SquareRoot {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scanner.nextInt();
		double temp ;
		double sq = num/2;
		do {
			temp = sq;
			sq = (temp+(num/temp))/2;
		}while((temp-sq)!=0);
		System.out.println("Square of the number is "+sq);
	}
}
