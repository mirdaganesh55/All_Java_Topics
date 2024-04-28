package com.org.java2;

public class StringMutable {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public StringMutable(String name) {
		super();
		this.name = name;
	}

	public static void main(String[] args) {
		StringMutable mutable = new StringMutable("Ganesh");
		System.out.println(mutable.getName());
		mutable.setName("Java is Awesome");
		System.out.println(mutable.getName());
	}
}
