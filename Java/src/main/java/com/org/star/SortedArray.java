package com.org.star;

import java.util.Scanner;

public class SortedArray {
	
	static boolean isSorted(int arr[]) {
		boolean check = true;
		// change i =\to 1 value
		for(int i =1;i<arr.length;i++) {
			if(arr[i] < arr[i-1]) {
				check = false;
				break;
			}
		}
		return check;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a size of array : ");
		int a = scanner.nextInt();
		int arr[] = new int[a];
		System.out.print("Enter "+a+" elements ");
		for(int i =0;i<arr.length;i++) {
			arr[i]= scanner.nextInt(); 
		}
		System.out.println("Is sorted "+isSorted(arr));
	}
}
