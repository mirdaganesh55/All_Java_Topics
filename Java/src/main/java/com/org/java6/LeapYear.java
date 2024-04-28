package com.org.java6;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year :");
		int a = scanner.nextInt();
		if((a%400 == 0) || (a%4 == 0 && a%100 != 0)) {
			System.out.println("Entered year is leap year "+a);
		}else {
			System.out.println("Entered year is normal year "+a);
		}
	}
}
