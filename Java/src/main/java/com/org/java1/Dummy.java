package com.org.java1;

public class Dummy {
	static void checkPrime(int a) {
		int count = 0;
		for(int i=1;i<=a;i++) {
			if(a%i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("Entered Number is Prime number "+a);
		}else {
			System.out.println("Not a prime number "+a);
		}
	}
	public static void main(String[] args) {
		checkPrime(99);
	}
}
