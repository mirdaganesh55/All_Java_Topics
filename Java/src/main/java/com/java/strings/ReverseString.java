package com.java.strings;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter characters : ");
		String name = scanner.nextLine();
		String rev = "";
		for(int i =name.length()-1;i>=0;i--) {
			rev = rev+name.charAt(i);
		}
		System.out.println("Reverse string is "+rev);
	}
}
