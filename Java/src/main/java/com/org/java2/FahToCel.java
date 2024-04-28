package com.org.java2;

import java.util.Scanner;

public class FahToCel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter fahrenheit number ");
		float num = scanner.nextFloat();
		float result ;
		String degreeSymbol = "\u00B0C";
		result = ((num-32)*5)/9;
        String formattedResult = String.format("%.2f", result);
        System.out.println("Temperature in Celsius: " + formattedResult + degreeSymbol);	}
}
