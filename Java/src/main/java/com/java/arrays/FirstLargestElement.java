package com.java.arrays;

import java.util.Scanner;

public class FirstLargestElement {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int a = scanner.nextInt();
		int arr[] = new int[a];
		System.out.println("Enter "+a+" elements : ");
		for(int i = 0;i<arr.length;i++) {
			arr[i] = scanner.nextInt();
		}
	}
}
