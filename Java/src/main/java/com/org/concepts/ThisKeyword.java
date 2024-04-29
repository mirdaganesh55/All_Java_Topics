package com.org.concepts;

public class ThisKeyword {
	
	int a ;
	ThisKeyword(int a){
//		a = a;
		this.a = a;
		System.out.println(this);
	}
	void result() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		ThisKeyword keyword =new ThisKeyword(100);
		System.out.println(keyword);
		keyword.result();
	}
}
