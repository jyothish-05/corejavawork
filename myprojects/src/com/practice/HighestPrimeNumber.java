package com.practice;

import java.util.Scanner;

public class HighestPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the starting number: ");
		int s = sc.nextInt();

		System.out.println("enetr the ending number: ");
		int e = sc.nextInt();

		int highestNumber = 0;

		for (int i = e; e >= s; i--) {
			if (isprime(i)) {
				highestNumber = i;
				break;
			}
		}
		if (highestNumber != 0) {
			System.out.println("the highest prime number between " + s + " and " + e + " is: " + highestNumber);
		}else {
			System.out.println("no prime number between the given numbers");
		}
		sc.close();
	}

	static boolean isprime(int n) {
		boolean status = true;

		if (n < 2) {
			return false;
		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}

		}
		return status;
	}

}
