package com.java.strings;

import java.util.Scanner;

public class SwapVariables {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter characters 2 words: ");
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		
		str1 = str1+str2;
		str2=str1.substring(0,(str1.length()-str2.length()));
		str1 = str1.substring(str2.length());
		System.out.println(str1+" "+str2);
	}
}
