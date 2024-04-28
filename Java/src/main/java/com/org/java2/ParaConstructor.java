package com.org.java2;

public class ParaConstructor {
	
	int id;
	String name;
	
	ParaConstructor(int a, String n){
		id = a;
		name = n;
	}
	void display() {
		System.out.println(id + name);
	}
	public static void main(String[] args) {
		ParaConstructor constructor = new ParaConstructor(1, "Hanuman");
		constructor.display();
	}
}
