package com.java.number;

import java.util.Scanner;

public class LargestThree {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = scanner.nextInt();
		System.out.println("Enter the second number : ");
		int b = scanner.nextInt();
		System.out.println("Enter the third number : ");
		int c = scanner.nextInt();
		int temp,largest;
		temp = (a>b)?a:b;
		largest = (c>temp)?c:temp;
		System.out.println("Largest among the three numbers is "+largest);
	}
}
