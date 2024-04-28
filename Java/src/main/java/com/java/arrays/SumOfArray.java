package com.java.arrays;

import java.util.Scanner;

public class SumOfArray {
	
	static void sumOfElements(int arr[]) {
		int n = arr.length;
		int sum = 0;
		for(int i =0;i<n;i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of an element is : "+sum);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int a = scanner.nextInt();
		int arr[] = new int[a];
		System.out.println("Enter "+a+" elements : ");
		for(int i = 0;i<arr.length;i++) {
			arr[i] = scanner.nextInt();
		}
		sumOfElements(arr);
	}
}
