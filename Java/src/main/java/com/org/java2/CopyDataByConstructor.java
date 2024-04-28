package com.org.java2;

public class CopyDataByConstructor {
	int id;
	String name;
	int age;
	CopyDataByConstructor(int a,String n){
		id = a;
		name = n;
	}
	CopyDataByConstructor(CopyDataByConstructor s){
		id = s.id;
		name = s.name;
	}
	void display() {
		System.out.println(id + name + age);
	}
	public static void main(String[] args) {
		CopyDataByConstructor constructor = new CopyDataByConstructor(1, "Hanuman");
		CopyDataByConstructor constructor2 = new CopyDataByConstructor(constructor);
		constructor.display();
		constructor2.display();
	}
}
