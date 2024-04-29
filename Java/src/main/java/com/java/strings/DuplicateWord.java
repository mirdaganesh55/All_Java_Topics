package com.java.strings;

import java.util.Scanner;

public class DuplicateWord {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter characters : ");
		String name = scanner.nextLine();
		
		String sl[] = name.split(" ");
		int count = 0;
		for(int i = 0;i<sl.length;i++) {
			count++;
			for(int j = i+1;j<sl.length;j++) {
				if(sl[i].equals(sl[j])) {
					count++;
					sl[j] = "0";
				}
			}
			if(count>1&&sl[i] != "0") {
				System.out.println(sl[i]);
			}
		}
	
	}
}
