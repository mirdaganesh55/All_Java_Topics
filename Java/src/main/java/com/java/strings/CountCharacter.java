package com.java.strings;

import java.util.Scanner;

public class CountCharacter {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a characters : ");
		String name = scanner.nextLine();
		int count = 0;
		for(int i = 0;i<name.length();i++) {
			if(name.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("Length of the string is "+count);
	}
}
