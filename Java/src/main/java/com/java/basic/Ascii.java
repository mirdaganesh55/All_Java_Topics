package com.java.basic;

import java.util.Scanner;

public class Ascii {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the character : ");
		char c = scanner.next().charAt(0);
		int a = c;
		System.out.println("ASCII value "+c+" is "+a);
	}
}
