package com.pw.arrays;
//here there is same memory address.
public class ArrayRef {
	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0] = 91;
		arr[1] = 71;
		arr[2] = 51;
		arr[3] = 16;
		arr[4] = 41;
		int arr2[] = arr;
		arr2[0]=0;
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr2[i]+" ");
		}
		
		System.out.println("After clone() arr3");
		
		int arr3[] = arr.clone();
		arr3[2] = 9;
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr3[i]+" ");
		}
	}
}
