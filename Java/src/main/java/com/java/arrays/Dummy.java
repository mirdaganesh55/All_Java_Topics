package com.java.arrays;

import java.util.Scanner;

public class Dummy {
	static void checkDuplicate(int arr[]) {
		int n = arr.length;
		for(int i =0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				if(arr[i] == arr[j]) {
					arr[i] = 10;
				}
			}
		}
		for(int o:arr) {
			if(o!= 10) {
				System.out.println(o);
			}
		}
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of ele to insert ");
        int n = sc.nextInt();
        int a[]= new int[n];
        System.out.println("Enter elements to insert ");
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        }
        checkDuplicate(a);
    }
}
