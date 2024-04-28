package com.org.java5;

import java.util.Scanner;

public class ClassA {
	static void minArray(int arr[]) {
		int min = arr[0];
		for(int i =1;i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
				System.out.println(min);
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a[]={33,4,5,1};//declaring and initializing an array  
		minArray(a);
	}
}	
