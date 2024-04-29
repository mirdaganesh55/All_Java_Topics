package com.java.strings;

import java.util.Scanner;

public class ReplaceSpaces {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter characters : ");
		String name = scanner.nextLine();
		name = name.replace(' ','-' );
		System.out.println(name);
	}
}
