package com.pw.arrays;

import java.util.Scanner;
	
public class NumberOfOccurance {
	
	static void countNumbers(int arr[],int x) {
		 int count = 0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i] == x ) {
				count++;
			}
		}
		if(count >0) {
			System.out.println(x+" number repeated "+count+" time");
		}else {
			System.out.println("No repeated number found with "+x);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a size of an array : ");
		int a = scanner.nextInt();
		int arr[] = new int[a];
		System.out.println("Enter "+a+" elements ");
		for(int i =0;i<arr.length;i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter x");
		int x = scanner.nextInt();
		countNumbers(arr, x);
	}
}