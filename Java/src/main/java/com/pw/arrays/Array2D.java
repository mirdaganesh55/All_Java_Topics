package com.pw.arrays;

public class Array2D {
	
	public static void main(String[] args) {
		int arr[][] = new int[2][2];
		arr[0][0] = 10;
		arr[0][1] = 12;
		arr[1][0] = 54;
		arr[1][1] = 33;
		
		for(int i = 0;i <arr.length;i++) {
			for(int j = 0;j<arr.length;j++) {
				System.out.println(arr[i][j]);
			}
		}
//		System.out.println(arr[1][0]);
		int age [][] = {{0,1},{65,2}};
//		System.out.println(age[1][1]);
		
		int arr1[][] = { {3,4,12},{43,55,77},{87,65,83} };
//		System.out.println(arr1[2][1]);
		
	}
}
