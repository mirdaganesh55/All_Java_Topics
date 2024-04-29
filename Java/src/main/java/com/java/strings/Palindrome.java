package com.java.strings;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter characters : ");
		String name = scanner.nextLine();
		String temp = name;
		String rev ="";
		for(int i = name.length()-1;i>=0;i--) {
			rev = rev+name.charAt(i);
		}
		if(rev.equals(temp)) {
			System.out.println("Palindrome "+temp);
		}else {
			System.out.println("Not palindrome "+temp);
		}
	}
}
