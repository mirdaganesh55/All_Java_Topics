package com.java.arrays;

public class CopyArray {
	
	public static void main(String[] args) {
		int arr1[] = {10,1,3,4,5};
		int arr2[] = arr1;
		for(int i =0;i<arr1.length;i++) {
			System.out.println(arr2[i]);
		}
	}
}
