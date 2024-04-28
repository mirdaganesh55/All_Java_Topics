package com.org.java3;

import java.util.Scanner;

public class LargestTwoNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First number ");
		int f = scanner.nextInt();
		System.out.println("Enter First number ");
		int s = scanner.nextInt();
		if(f>s) {
			System.out.println("Greatest Number is first one "+f);
		}else {
			System.out.println("Greatest Number is Second one "+s);

		}
	}
}
