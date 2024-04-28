package com.java.arrays;

import java.util.Scanner;

public class OddAndEven {
	
	static void printNum(int arr[]) {
		int n = arr.length;
		for(int i= 0;i<n;i++) {
			if(arr[i]%2 == 0) {
				System.out.print("Even element is : "+arr[i]);
				System.out.println();
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
		printNum(arr);
	}

}
