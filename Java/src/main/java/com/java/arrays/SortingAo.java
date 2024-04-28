package com.java.arrays;

import java.util.Scanner;

public class SortingAo {
		
	static void sorting(int arr[]) {
		int n = arr.length;
		int temp;
		for(int i =0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp; 
				}
			}
		}
		System.out.println();
		for(int i =0;i<arr.length;i++) {
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
		System.out.print("Before sorting");
		for(Object o:arr) {
			System.out.print(" "+o);
		}
		sorting(arr);
	}
}
