package com.pw.arrays;

public class LinearSearchArray {
	
	static void searchInArray(int a) {
		int num[] = {1,55,33,77,11,33,32};
		int ans = -1;
		for(int i =0;i<num.length;i++) {
			if(num[i] == a) {
				ans = i;
				break;
			}
		}
		if(ans == -1) {
				System.out.println("Array not found for number "+a+ " is "+ans);
		}else {
			System.out.println("Array found "+a+ " at index position "+ans);
		}
	}
	public static void main(String[] args) {
		searchInArray(33);
	}
}
