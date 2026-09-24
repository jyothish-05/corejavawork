package com.practice;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();

		int sumofdigits = sumofdigits(n);
		System.out.println("the sum of digits of the given number: " + sumofdigits);

		sc.close();
	}

	static int sumofdigits(int n) {
		int sum = 0;
		int r = 0;
		int count = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r;
			count++;

		}System.out.println("the count of the digits added from the given number: "+count);
		return sum;
		

	}

}
