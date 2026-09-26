package com.practice;

import java.util.Scanner;

public class HailstoneSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int count = 0;

		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = (3 * n) + 1;
			}
			count++;
		}
		System.out.println("the sequence reaches 1 in " + count + " steps");

		sc.close();
	}

}
