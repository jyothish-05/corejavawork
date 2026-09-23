package com.practice;

import java.util.Scanner;

public class EvenNumberWL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int limit = sc.nextInt();
		int n = 2;
		while (n <= limit) {
			System.out.print(n + " ");
			n += 2;
		}
		sc.close();

	}

}
