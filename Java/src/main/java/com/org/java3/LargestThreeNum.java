package com.org.java3;

import java.util.Scanner;

public class LargestThreeNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = scanner.nextInt();
		System.out.println("Enter Second Number");
		int b = scanner.nextInt();
		System.out.println("Enter Third Number");
		int c = scanner.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println("Largest number is first one "+a);
			}
		}else if (b>c) {
			if(b>a) {
				System.out.println("Largest number is Second one "+b);
			}
		}else {
			System.out.println("Largest number is Third one "+c);
		}
	}
}
