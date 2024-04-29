package com.org.concepts;

class Student{
	int id ;
	String name;
}

public class ByRefVariable {
	public static void main(String[] args) {
		Student student = new Student();
		student.id = 1;
		student.name = "Hanuman";
		System.out.println(student.id + student.name);
	}
}
