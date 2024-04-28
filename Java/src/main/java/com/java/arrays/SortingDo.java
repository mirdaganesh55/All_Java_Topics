package com.java.arrays;

import java.util.Scanner;

public class SortingDo {
		
	static void sortingNumber(int arr[]) {
		System.out.println("After Sorting");
		int n = arr.length;
		int temp;
		for(int i =0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp; 
				}
			}
		}
		for(int i =0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int a = scanner.nextInt();
		System.out.println("Enter "+a+" elements");
		int arr[] = new int[a];
		for(int i = 0;i<a;i++) {
			arr[i] = scanner.nextInt();
		}
		for(Object o:arr) {
			System.out.print(" "+o);
		}
		sortingNumber(arr);
	}
}
