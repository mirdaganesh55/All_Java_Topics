package com.org.java1;

public class PrintEvenNumbers {
	static void EvenNum() {
		int i = 0;
		while(i <= 10) {
			System.out.println("Even "+i);
			i+=2;
		}
	}
	static void OddNum() {
		int i = 1;
		while(i <= 10) {
			System.out.println("Odd "+i);
			i+=2;
		}
	}
	public static void main(String[] args) {
		PrintEvenNumbers.EvenNum();
		PrintEvenNumbers.OddNum();
	}
}
