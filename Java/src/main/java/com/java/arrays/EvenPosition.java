package com.java.arrays;

import java.util.Scanner;

public class EvenPosition {
	
	static void checkPosition(int arr[]) {
		int n = arr.length;
		for(int i = 0;i<n;i++) {
			if(i%2 == 0) {
				System.out.println("Even position element is "+arr[i]);
			}
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
		checkPosition(arr);
	}
}
