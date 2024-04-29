package com.org.concepts;

public class NoStatic {
	
	static {
		System.out.println("Static block");
	}
	{
		System.out.println("Instance block");
	}
	NoStatic(){
		System.out.println("Constructor is executed");
	}
	public static void main(String[] args) {
		NoStatic noStatic = new NoStatic();
	}
}
