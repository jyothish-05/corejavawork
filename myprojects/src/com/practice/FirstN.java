package com.practice;

import java.util.Scanner;

public class FirstN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();

		fnumber(n);
		sc.close();

	}

	static void fnumber(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("the sum of first " + n + "natural numbers is: " + sum);

	}

}
