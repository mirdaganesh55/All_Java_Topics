package com.org.java3;

import java.util.Scanner;

class Dummy{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a degree : ");
		float num = scanner.nextFloat();
		float res;
		res = ((num-32)*5)/9;
		String degreeSymbol = "\u00B0C";
		System.out.println("Fah to cel "+res+degreeSymbol);
		int  arr[] = new int[] {};
}
}