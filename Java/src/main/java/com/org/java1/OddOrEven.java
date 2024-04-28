package com.org.java1;

public class OddOrEven {
	static void checkNumber(int a) {
		if(a%2 == 0) {
			System.out.println("The Entered Number is Even "+a);
		}else {
			System.out.println("The Entered Number is Odd "+a);
		}
	}
	public static void main(String[] args) {
		OddOrEven.checkNumber(-11);
	}
}
