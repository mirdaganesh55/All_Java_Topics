package com.org.java1;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Year :");
		int a = scanner.nextInt();
		if(a%4 == 0) {
			System.out.println("It is a Leap Year "+a);
		}else {
			System.out.println("It is Common Year "+a);
		}
	}
}
