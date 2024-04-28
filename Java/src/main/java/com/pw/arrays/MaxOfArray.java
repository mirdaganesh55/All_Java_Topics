package com.pw.arrays;

public class MaxOfArray {
	
	static void maxArray(int arr[]) {
		int sum = 0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i] > sum) {
				sum = arr[i];
			}
		}
		System.out.println("Greatest Array is "+sum);
	}
	
	public static void main(String[] args) {
		int num[] = {1,55,33,77,11,32};
		maxArray(num);
	}
}
