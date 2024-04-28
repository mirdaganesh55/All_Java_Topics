package com.org.java2;

public class SBuilder {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Ganesh");
		StringBuilder sb2 = new StringBuilder(" Mirda");
		StringBuilder s = sb.append(sb2);
//		String s1 = sb.append(sb2); CE
		System.out.println(s);
	}
}
