package com.org.java2;

// Not working need to correct it
public class PrintPrimeNumbers {
	static void printNumbers(int a) {
		int count = 0;
		for(int i = 1; i<=a ; i++) {
			for(int f = 2;f<=i-1;f++) {
				if(i%f == 0) {
					count += 1;
				}
			}
			if(count == 0) {
				System.out.println(i);
			}
		}
		
	}
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a number ");
		printNumbers(100);
	}
}
