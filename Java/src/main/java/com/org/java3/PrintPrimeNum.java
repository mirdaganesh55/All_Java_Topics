package com.org.java3;

// done the prime number doubt
public class PrintPrimeNum {
	public static void main(String[] args) {
		for(int i = 2;i<=100;i++) {
			int temp = 0;
			for(int j = 2;j<=i-1;j++) {
				if(i%j == 0) {
					temp++;
				}
			}
			if(temp == 0) {
				System.out.println(i);
			}
		}
	}

}
