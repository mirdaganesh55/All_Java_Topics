package com.pw.arrays;

import java.util.Scanner;

public class FirstRepeatingNum {
	
	static int checkNumber(int arr[]) {
		int n = arr.length;
		for(int i = 0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				if(arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a size of an array : ");
		int a = scanner.nextInt();
		System.out.println("Enter "+a+" elememts : ");
		int arr[] = new int [a];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = scanner.nextInt(); 
		}
		System.out.println(checkNumber(arr));
	}
}
