package com.java.number;

import java.util.Scanner;

public class NumberToWord {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scanner.nextInt();//321
		
		if(num<=0 || num>999) {
			System.out.println("Invalid number");
		}
		else {
			int a = num%10; // last 
			int b = num/10;
			int c = b%10;//121
			int d = num/100;//first
			String uP[] = {" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
			String tP[] = {" ","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};
			String h = "Hundred";
			if(num < 20) {
				System.out.println(uP[num]);
			}else if(num>=20 && num<100) {
				System.out.println(tP[c]+" "+uP[a]);
			}else {
				System.out.println(uP[d]+" "+h+" "+tP[c]+" "+uP[a]);
			}
		}
	}
}
