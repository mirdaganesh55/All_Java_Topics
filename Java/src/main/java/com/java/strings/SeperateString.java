package com.java.strings;

import java.util.Scanner;

public class SeperateString {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter characters : ");
		String name = scanner.nextLine();
		for(int i =0;i<name.length();i++) {
			System.out.print(name.charAt(i)+" ");
		}
	}
}
