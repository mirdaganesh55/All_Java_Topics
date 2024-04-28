package com.pw.arrays;

import java.util.Scanner;

public class LastNumberOccurance {
	
		static void lastOccurance(int arr[],int a) {
			int ans = -1;
			for(int i =0;i<arr.length;i++) {
				if(arr[i]==a) {
					ans = i;
//					break;
				}
			}
			if(ans>-1) {
				System.out.println("Entered number is "+a+" present in "+ans+" index");
			}else {
				System.out.println("Number not found");
			}
		}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int a = scanner.nextInt();
		System.out.print("Enter "+a+" elements");
		int arr[] = new int[a];
		for(int i =0;i<arr.length;i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter x ");
		int x = scanner.nextInt();
		lastOccurance(arr, x);
	}
}
