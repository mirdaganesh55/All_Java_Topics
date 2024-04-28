package com.org.java3;

import java.util.Scanner;

public class RevString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a name ");
		String name = scanner.nextLine();
		String rev = "";
//		int len = name.length();
//		for(int i = len-1;i>=0;i--) {
//			rev = rev+name.charAt(i);
//		}
//		System.out.println(rev);
		//By using arrays we reverse the method
		char a[] = name.toCharArray();
		int len = a.length;
		for(int i = len-1;i >=0;i--) {
			rev = rev+a[i];
		}
		System.out.println(rev);
	}
}
