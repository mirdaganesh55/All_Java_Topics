package com.pw.arrays;

import java.util.Scanner;

public class TakingInputOfArray {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a size of array : ");
		int a = scanner.nextInt();
		int arr[] = new int[a];
		System.out.println("Enter "+a+" elements");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scanner.nextInt();
		}
		for(int i=0;i<a;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
