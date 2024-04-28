package com.java.number;

import java.util.Scanner;

public class PositiveOrNegative {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int x = scanner.nextInt();
		if (x>0) {
			System.out.println("Positive "+x);
		}else if(x<0) {
			System.out.println("Negative "+x);
		}else {
			System.out.println("Neutral Number "+x);
		}
	}
}
