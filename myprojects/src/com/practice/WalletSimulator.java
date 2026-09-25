package com.practice;

import java.util.Scanner;

public class WalletSimulator {
	static int balance = 25000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		System.out.println("************* choose the option************");
		System.out.println("1. check balance");
		System.out.println("2. Deposite amount");
		System.out.println("3. Withdraw amount");
		System.out.println("4. Exit");

		while (choice != 4) {
			System.out.println("Enter your option: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				checkbalance();
				break;
			case 2:
				System.out.println("Enter amount: ");
				int deposite = sc.nextInt();
				depositeamount(deposite);
				System.out.println("Amount deposited, current balance: " + balance);
				break;
			case 3:
				System.out.println("Enter amount: ");
				int withdraw = sc.nextInt();
				withdrawamount(withdraw);
				if (balance < 0) {
					System.out.println("insufficent balance");
				} else {
					System.out.println("Amount has been withdrawn, current balance: " + balance);
				}
				break;
			case 4:
				System.out.println("Thank you for the visit,have a nice day!!");
				break;
			default:
				System.out.println("Invalid option selected");
				break;
			}

		}
		sc.close();
	}

	static void checkbalance() {
		System.out.println("your balance: " + balance);
	}

	static int depositeamount(int deposite) {
		balance = balance + deposite;
		return deposite;
	}

	static int withdrawamount(int withdraw) {
		balance = balance - withdraw;
		return withdraw;
	}

}
