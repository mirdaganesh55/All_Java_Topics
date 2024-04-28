package com.org.numbers;

import java.util.Scanner;

public class Atm {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int balance = 100000,deposit,withdraw;
		int choice ;
		do {
			System.out.println("Select operation : ");
			System.out.println("Choose 1 for withdraw");
			System.out.println("Choose 2 for deposit");
			System.out.println("Choose 3 for check balance");
			System.out.println("Choose 4 for exit");
			choice = scanner.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter amount to withdaw ");
				int amount = scanner.nextInt();
				if(amount > balance) {
					System.out.println("Insuffient funds");
				}else {
					System.out.println("Money withdraw successfully");
				}
				System.out.println();
				break;
			}
			case 2:{
				System.out.println("Enter money to deposit ");
				int depo = scanner.nextInt();
				balance = balance +depo;
				System.out.println("Money deposited successfully "+balance);
				System.out.println();
				break;
			}
			case 3:{
				System.out.println("Balance : "+balance);
				System.out.println();
				break;
			}
			case 4:{
				break;
			}
			}
			
		}while(choice!=4);
	}
}
