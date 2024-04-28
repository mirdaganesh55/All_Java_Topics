package com.org.java6;

import java.util.Scanner;

public class Ascii {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Character : ");
		char c = scanner.next().charAt(0);
		int ascii = c;
		System.out.println("The ASCII code for "+c+" is "+ascii);
	}
}
