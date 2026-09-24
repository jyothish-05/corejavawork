package com.practice;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();

		int original = n;
		int reverse = 0;

		while (n > 0) {
			int lastdigit = n % 10;
			reverse = (reverse * 10) + lastdigit;
			n = n / 10;
		}
		System.out.println("Reversed number: "+ reverse);
		if (original == reverse) {
			System.out.println("the given number is palindrome");
		} else {
			System.out.println("the given number is not palindrome");
		}
		sc.close();
	}

}
