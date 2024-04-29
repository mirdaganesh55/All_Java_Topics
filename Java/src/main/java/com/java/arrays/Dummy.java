package com.java.arrays;

import java.util.Scanner;

public class Dummy {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of ele to insert ");
        int n = sc.nextInt();
        int a[]= new int[n];
        System.out.println("Enter elements to insert ");
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        }
        System.out.println("Elements in annary are : ");
        for (int i : a) {
			System.out.println(i);
		}
        
        boolean counted[] = new boolean[n];
        int count=0;
        for(int i = 0; i < n; i++) {
        	count=1;
        	if(counted[i]) {
        		continue;
        	}
            for(int j = i + 1; j < n; j++) {
                if(a[i] == a[j]) {
                	count++;
                	counted[j]=true;
                 }
            }
            System.out.println(a[i]+" occur "+count+" times");
        }
    }

}
