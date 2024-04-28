package com.java.strings;

import java.util.Scanner;

public class CountVowelsAndConsonents {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter characters : ");
		String name = scanner.nextLine();
		String lName = name.toLowerCase();
		int vCount = 0,cCount = 0;
		for(int i = 0;i<lName.length();i++) {
			if(lName.charAt(i) == 'a' || lName.charAt(i) == 'e'||lName.charAt(i) == 'i'
					||lName.charAt(i) == 'o'||lName.charAt(i) == 'u') {
				vCount++;
			}else if(lName.charAt(i)>='a' && lName.charAt(i) <= 'z'){
				cCount++;
			}
		}
		System.out.println("Number of vowels: " + vCount);    
		System.out.println("Number of consonants: " + cCount);  
	}
}	
