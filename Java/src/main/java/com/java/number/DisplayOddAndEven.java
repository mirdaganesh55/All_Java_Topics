package com.java.number;

import java.util.Scanner;

public class DisplayOddAndEven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scanner.nextInt();
		for(int i =1;i<=num;i++) {
			if(i%2==0) {
				System.out.println("Even "+i);
			}
		}
		System.out.println("-------------------------");
		for(int i =1;i<=num;i++) {
			if(i%2!=0) {
				System.out.println("Odd "+i);
			}
		}
	}

}
