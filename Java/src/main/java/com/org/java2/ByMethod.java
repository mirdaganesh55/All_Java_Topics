package com.org.java2;

class StudentData{
	int id;
	String name;
	void insertData(int a,String n) {
		id = a;
		name = n;
	}
	void displayData() {
		System.out.println(id + name);
	}
}

public class ByMethod {
	public static void main(String[] args) {
		StudentData s1 = new StudentData();
		s1.insertData(1, "Rahul");
		StudentData s2 = new StudentData();
		s2.insertData(2, "Ganesh");
		s1.displayData();
		s2.displayData();
	}
}
