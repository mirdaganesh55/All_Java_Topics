package com.org.java1;

public class DoWhileLoop {
	void OddNum() {
		int i = 1;
		do {
			System.out.println("Odd Numbers "+i);
			i+=2;
		} while (i <= 10);
	}
	public static void main(String[] args) {
		DoWhileLoop doWhileLoop = new DoWhileLoop();
		doWhileLoop.OddNum();
	}
}
