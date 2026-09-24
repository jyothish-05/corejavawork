package com.practice;

import java.util.Scanner;

public class RunningTotal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int number = sc.nextInt();
		int sum = 0;
		while (number != 0) {
			sum += number;
			number = sc.nextInt();
		}
		System.out.println("the running total of given numbers is: " + sum);
		sc.close();
	}

}
