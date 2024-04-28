package com.org.java1;

public class ContinueStatement {
	
	public static int addition(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		for(int i = 1; i <= 10 ;i++) {
			if(i==5) {
				continue;
			}
			System.out.println("Number is : "+i);
		}
		int result = ContinueStatement.addition(10, 55);
		System.out.println(result);
	}
}
