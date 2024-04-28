package com.java.arrays;

import java.util.Scanner;

public class ReverseAnArray {
	
	static void reverseArray(int arr[]) {
		int n = arr.length;
		System.out.print("Reverse an array : ");
		for(int i = n-1;i>=0;i--) {
			System.out.print(" "+arr[i]);
		}
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
		System.out.print("Original array :");
		for(Object o:arr) {
			System.out.print(" "+o);
		}
		System.out.println();
		reverseArray(arr);
	}
}
