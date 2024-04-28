package com.org.java2;

class A{
	public  void print(){
		System.out.println("1");
	}
}
class B extends A{
	public  void print(){
		System.out.println("2");
	}
}
public class Inheritance {
	public static void main(String[] args) {
		A a = new B();
		a.print();
	}
}
