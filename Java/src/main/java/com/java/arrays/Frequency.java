package com.java.arrays;

import java.util.Scanner;

public class Frequency {
	
	static void checkFrequency(int arr[]) {
		int n = arr.length;
		boolean counted[] = new boolean[n];
		int count = 0;
		for(int i = 0;i<n;i++) {
			count = 1;
			if(counted[i]) {
				continue;
			}
			for(int j = i+1;j<n;j++) {
				if(arr[i] == arr[j]) {
					count++;
					counted[j] = true;
				}
			}
			System.out.println(arr[i]+ "is repeated  "+count+" times");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int a = scanner.nextInt();
		System.out.println("Enter "+a+" elements : ");
		int arr[] = new int[a];
		for(int i =0;i<arr.length;i++) {
			arr[i] = scanner.nextInt();
		}
		checkFrequency(arr);
	}
}
