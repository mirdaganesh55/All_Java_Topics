package com.org.java1;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a characters");
		String name = scanner.nextLine();
		
		String rev="";
		int len = name.length();
		for(int i = len-1;i>=0;i--) {
			rev = rev+name.charAt(i);
		}
		System.out.println("Reverse String "+rev);
		
		
		//Method two by using array character 2
//		char a[] = name.toCharArray();
//		int leng = a.length;
//		for(int i = leng-1;i>=0;i--) {
//			rev = rev+a[i];
//		}
//		System.out.println("Rev the String "+rev);
//		
//		//Using buffer class 3
//		StringBuffer sb = new StringBuffer(name);
//		System.out.println(sb.reverse());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
