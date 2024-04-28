package com.org.java6;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number : ");
		int a = scanner.nextInt();
		for(int i = 1; i <= 10;i++) {
			int res = a * i;
			System.out.println(a+"*"+i+"="+res);
		}
	}
}
