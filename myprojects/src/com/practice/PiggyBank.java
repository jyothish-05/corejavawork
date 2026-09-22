package com.practice;
import java.util.Scanner;

public class PiggyBank {
	double savings = 0;
	boolean isBroken = false;
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		PiggyBank mybank = new PiggyBank();
		mybank.start();

	}
	void start() {
		
		System.out.println("total savings added into the bank: ");
		double add = sc.nextDouble();
		addMoney(add);
		
		System.out.println("Extra savings added into the bank: ");
		double added = sc.nextDouble();
		addMoney(added);
		
		System.out.println("if you wanted break the piggy Bank press '1' or if you don't press '0'");
	
			
			
		
		
	}
	void addMoney(double value) {
		savings+=value;
		
	}
	void breakBank() {
		
	}

}
