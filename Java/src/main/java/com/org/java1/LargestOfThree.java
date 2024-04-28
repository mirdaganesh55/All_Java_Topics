package com.org.java1;

public class LargestOfThree {
	
	static void checkLargeNum(int a,int b,int c) {
		if(a>b) {
			if(a>c) {
				System.out.println("Largest Number is a "+a);
			}
		}
		else if(b>c) {
			if(b>a) {
				System.out.println("Largest Number is b "+b);
			}
		}
		else {
			System.out.println("Largest Number is c "+c);
		}
	}
	public static void main(String[] args) {
		LargestOfThree.checkLargeNum(987, 3, 291);
	}
}
