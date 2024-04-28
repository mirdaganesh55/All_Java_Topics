package com.java.DArray;

import java.util.Scanner;

public class SumOfTwoArray {
	
	static void printNumbers(int arr[][]) {
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
	}
	static void add(int a[][],int r1,int c1,int b[][],int r2,int c2) {
		if(r1 != r2 || c1 != c2) {
			System.out.println("Invalid number...");
		}else {
			int sum[][] = new int[r1][c1];
			for(int i = 0;i<r1;i++) {
				for(int j = 0;j<c1;j++) {
					sum[i][j] = a[i][j] + b[i][j];
				}
			}
			printNumbers(sum);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int r1 = scanner.nextInt();
		System.out.println("Enter number of coloums : ");
		int c1 = scanner.nextInt();
		System.out.println("Enter "+(r1*c1)+" elements ");
		int a[][] = new int[r1][c1];
		for(int i = 0;i<r1;i++) {
			for(int j = 0;j<c1;j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Enter number of rows : ");
		int r2 = scanner.nextInt();
		System.out.println("Enter number of coloums : ");
		int c2 = scanner.nextInt();
		System.out.println("Enter "+(r2*c2)+" elements ");
		int b[][] = new int[r2][c2];
		for(int i = 0;i<r2;i++) {
			for(int j = 0;j<c2;j++) {
				b[i][j] = scanner.nextInt();
			}
		}
		add(a, r1, c1, b, r2, c2);
	}
}
