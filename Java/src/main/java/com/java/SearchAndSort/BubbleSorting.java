package com.java.SearchAndSort;

import java.util.Scanner;

public class BubbleSorting {
	
	static void sortNumber(int arr[]) {
		int n = arr.length;
		int temp;
		for(int i = 0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(Object o:arr) {
			System.out.println(o);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of an array ");
		int a = scanner.nextInt();
		System.out.println("Enter "+a+" elements");
		int arr[] = new int[a];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = scanner.nextInt(); 
		}
		sortNumber(arr);
	}
}
