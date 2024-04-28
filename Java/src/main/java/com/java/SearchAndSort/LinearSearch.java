package com.java.SearchAndSort;

import java.awt.Checkbox;
import java.util.Scanner;

public class LinearSearch {
	
	static void checkNumber(int arr[],int x) {
		int n = arr.length;
		for(int i =0;i<n;i++) {
			if(arr[i] == x) {
				System.out.println("Number is present at "+i+" index");
				return;
			}
		}
		System.out.println("Not");
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
		System.out.println("Enter x ");
		int x = scanner.nextInt();
		checkNumber(arr, x);
	}
	
}
