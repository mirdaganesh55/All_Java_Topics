package com.org.java3;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter year ");
		int year = scanner.nextInt();
		if((year % 400 == 0)|| (year % 4 == 0 && year % 100 != 0)){
			System.out.println("Leap year "+year);
		}else {
			System.out.println("Normal year "+year);
		}
	}
}
