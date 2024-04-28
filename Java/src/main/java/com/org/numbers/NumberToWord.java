package com.org.numbers;

import java.util.Scanner;
//  Doubt
public class NumberToWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number : ");
		int a = scanner.nextInt();
		if(a < 0 || a > 999) {
			System.out.println("Invalid number");
		}
		else {
			int t1 = a%10;//32 thirty two
			int d = a/10;//3
			int t2 = d%10;//2
			int t3 = a/100;//3

			String uw[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
			String tw[] = {" ","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};
			String hw ="Hundred" ;
			if(a < 20) {
				System.out.println(uw[a]);
			}else if(a>=20 || a<100) {
				System.out.println(tw[d]+uw[t1]);
			}else if(a == 100){
				
					System.out.println(hw);
					}
					else {
						System.out.println(uw[t3]+hw+tw[t2]+uw[t1]);

					}
				}
			}
}
