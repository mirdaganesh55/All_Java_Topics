package com.org.java1;

public class Prime {
	static void checkNumber(int a) {
		int count = 0;
		for(int i =1;i<=a;i++) {
			if(a%i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Entered number is prime "+a);
		}else {
			System.out.println("Entered number is not prime number "+a);
		}
	}
	public static void main(String[] args) {
		checkNumber(13);
	}
}
