package com.java.strings;

import java.util.Scanner;

public class FindDuplicates {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter characters : ");
		String name = scanner.nextLine();
		char ch[] = name.toCharArray();
		int count = 0;
		for(int i =0;i<name.length();i++) {
			count++;
			for(int j = i+1;j<name.length();j++) {
				if(ch[i] == ch[j] && ch[i] !=' ') {
					count++;
					ch[j] = '0';
				}
			}
			if(count >1&&ch[i]!='0') {
				System.out.println(ch[i]);
			}
		}
		
	}
}
