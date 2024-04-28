package com.org.numbers;

import java.util.Scanner;

public class Buzz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number : ");
		int a = scanner.nextInt();
		int temp = a;
		int l = temp%10;
		if((l == 7)||(temp%7 == 0) ){
			System.out.println("Buzz number "+a);
		}
		else {
			System.out.println("Not a buzz number "+a);
		}
	}
}
