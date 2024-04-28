package com.org.java2;

public class CopyDataWithoutConstructor {
	int id;
	String name;
	int age;
	CopyDataWithoutConstructor(int a,String n){
		id = a;
		name = n;
	}
	CopyDataWithoutConstructor(){

		}
	void display() {
		System.out.println(id + name + age);
	}
	public static void main(String[] args) {
		CopyDataWithoutConstructor constructor = new CopyDataWithoutConstructor(1, "Hanuman");
		CopyDataWithoutConstructor constructor2 = new CopyDataWithoutConstructor();
		constructor2.id = constructor.id;
		constructor2.name = constructor.name;
		constructor.display();
		constructor2.display();
	}
}
