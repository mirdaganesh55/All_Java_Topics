package com.org.concepts;


class Shape{
	void show() {
		System.out.println("Parent Method");
	}
}
class Square extends Shape{
	void show() {
//		super.show();
		System.out.println("Sub Class Method");
	}
}
public class OverridingMeth {
	public static void main(String[] args) {
		Shape shape = new Square();
		shape.show();
	}
}
