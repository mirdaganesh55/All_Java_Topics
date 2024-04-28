package com.java.strings;

import java.util.Scanner;

public class RemoveSpaces {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter characters : ");
		String name = scanner.nextLine();
		name = name.replaceAll("\\s", "");
		System.out.println(name);
	}
}
