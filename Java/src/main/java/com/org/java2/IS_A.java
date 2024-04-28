package com.org.java2;
	
class Faculty{
	float sal = 30000f;
}
public class IS_A extends Faculty
{
	float bonus = 2800;
	public static void main(String[] args) {
		IS_A a = new IS_A();
		System.out.println(a.sal);
		System.out.println(a.bonus);
	}
}
