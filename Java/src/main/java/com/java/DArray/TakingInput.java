package com.java.DArray;

import java.util.Scanner;

public class TakingInput {
	
	static void printNumbers(int arr[][]) {
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int r = scanner.nextInt();
		System.out.println("Enter number of coloums : ");
		int c = scanner.nextInt();
		System.out.println("Enter "+(r*c)+" elements ");
		int arr[][] = new int[r][c];
		for(int i = 0;i<r;i++) {
			for(int j = 0;j<c;j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		printNumbers(arr);
	}
}
