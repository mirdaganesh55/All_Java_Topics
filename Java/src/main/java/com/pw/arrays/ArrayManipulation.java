package com.pw.arrays;

import java.util.Scanner;

public class ArrayManipulation {
	
	static int checkUnique(int arr[]) {
		int n = arr.length;
		int count = 0;
		for(int i = 0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				if(arr[i] == arr[j]) {
					arr[i] = -1;
					arr[j] = -1;
				}
			}
		}
		int ans = -1;
		for(int i = 0;i<n;i++) {
			if(arr[i] > 0) {
				ans = arr[i];
			}
		}
		return ans;
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
		System.out.println("Unique element is "+checkUnique(arr));
	}
}
