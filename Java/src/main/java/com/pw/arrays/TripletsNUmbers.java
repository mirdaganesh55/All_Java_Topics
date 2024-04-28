package com.pw.arrays;

import java.util.Scanner;

public class TripletsNUmbers {
	
	 static int checkNumber(int arr[],int target) {
		 int n = arr.length;
		 int count = 0;
		 for(int i =0;i<n;i++) {
			 for(int j = i+1;j<n;j++) {
				 for(int k = j+1;k<n;k++) {
					 if(arr[i] + arr[j] + arr[k] == target) {
						 count++;
					 }
				 }
			 }
		 }
		return count;
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
		System.out.println("Enter x ");
		int x = scanner.nextInt();
		System.out.println(checkNumber(arr, x));
	}
	
}
