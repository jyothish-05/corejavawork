package com.practice;

import java.util.Scanner;

public class Reverse_a_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		long n = sc.nextLong();

		long revnum = reversenumber(n);
		System.out.println("the reverse of the given number is: " + revnum);
		sc.close();
	}

	static long reversenumber(long n) {
		long rev = 0;
		long r = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;
		}
		return rev;
	}

}
