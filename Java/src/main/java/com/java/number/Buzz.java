package com.java.number;

import java.util.Scanner;

public class Buzz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scanner.nextInt();
		if ((num%7 == 0)|| (num%10 == 7)) {
			System.out.println("Buzz number "+num);
		}else {
			System.out.println("Not a buzz number "+num);
		}
	}
}
