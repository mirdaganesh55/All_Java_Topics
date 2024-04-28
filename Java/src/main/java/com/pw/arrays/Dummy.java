package com.pw.arrays;

import java.util.Scanner;

public class Dummy {
	 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int a = scanner.nextInt();
		System.out.println("Enter "+a+" elemets : ");
		int arr[] = new int[a];
		for(int i =0;i<arr.length;i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter x");
		int x = scanner.nextInt();
	}
}
