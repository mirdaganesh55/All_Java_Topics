package com.org.java1;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number ");
		int a = scanner.nextInt();
		for(int i = 1;i<= 10;i++) {
			int result = a * i;
			System.out.println(a +"*"+ i + "=" +result);
		}
	}
}
