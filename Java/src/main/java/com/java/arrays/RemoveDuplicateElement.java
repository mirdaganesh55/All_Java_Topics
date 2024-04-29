package com.java.arrays;

import java.util.Scanner;

public class RemoveDuplicateElement {
	
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter num of elements to insert into array: ");
	       int n = sc.nextInt();
	       int a[] = new int[n];
	       System.out.println("Enter elements to insert: ");
	       for(int i=0;i<n;i++) {
	    	   a[i]=sc.nextInt();
	       }
	       System.out.println("Elements in A array are: ");
	       for (int i : a) {
			System.out.print(i+" ");
		}
	       for(int i=0;i<n;i++) {
	    	   for(int j=i+1;j<n;j++) {
	    		   if(a[i]==a[j]) {
	    			   a[i]=10;
	    		   }
	    	   }
	       }
	       System.out.println("\nArray after removing duplicates: ");
	       for (int i : a) {
	           if (i != 10) {
	               System.out.print(i + " ");
	           }
		}
	    }
}