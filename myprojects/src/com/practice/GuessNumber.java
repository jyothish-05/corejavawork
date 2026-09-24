package com.practice;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nmber: ");
		int guess = sc.nextInt();

		int target = 67;
		while (guess != target) {
			if (guess > target) {
				System.out.println("Number is high,try lower");
			} else {
				System.out.println("Number is low,try higher");
			}
			guess = sc.nextInt();
		}
		if(guess == target) {
			System.out.println("that's correct");
		}
		sc.close();
	}

}
