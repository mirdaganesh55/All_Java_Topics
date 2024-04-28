package com.org.java3;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int res;
		int a = scanner.nextInt();
		for(int i =1 ; i <=10; i++) {
			res = a * i;
			System.out.println(a +"*" +i+ "=" +res);
		}
	}
}
