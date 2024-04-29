package com.org.concepts;

public class OverloadingConstructor {
	int id;
	String name;
	int age;
	OverloadingConstructor(int a,String n){
		id = a;
		name = n;
	}
	OverloadingConstructor(int a , String n,int b){
		id = a;
		name = n;
		age = b;
	}
	void display() {
		System.out.println(id + name + age);
	}
	public static void main(String[] args) {
		OverloadingConstructor constructor = new OverloadingConstructor(1, "Hanuman");
		OverloadingConstructor constructor2 = new OverloadingConstructor(2, "Ganesh",26);
		constructor.display();
		constructor2.display();
	}
}
