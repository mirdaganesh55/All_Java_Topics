package com.org.java5;

import java.util.Scanner;

public class Dummy {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a size of an array : ");
		int s = scanner.nextInt();
		System.out.println("Enter "+s+" elements ");
		int arr[] = new int[s];
		for(int i =0;i<arr.length;i++) {
			arr[i] = scanner.nextInt();
		}
		for(int i =0;i<s;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
