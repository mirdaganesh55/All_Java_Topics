package com.org.java1;

import java.util.Scanner;

public class PerfectSquare {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scanner.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			int res = n / i; //25/5 == 0
			int sq = i*i ;
			
		if(res==0 && sq == n) {
			System.out.println(n + " is not a perfect Square");
		} else {
			System.out.println(n + "is  a perfect square");
		}
			
		}
		
	}

}
