package com.org.java1;

public class BreakStatement {
	public static void main(String[] args) {
		for(int i =1; i<=10 ; i++) {
			System.out.println("Number is : "+i);
			if(i == 6) {
				break;
			}
		}
	}
}
