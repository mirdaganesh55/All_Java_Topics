package com.org.java2;

public class SFormatMeth {
	public static void main(String[] args) {
		String s1 = "Ganesh";
		String s2 = " Mirda";
		String s4 = " Very Good";
		String s3 = String.format("%s%s%s",s1,s2,s4);
		System.out.println(s3.toString());
	}
}
