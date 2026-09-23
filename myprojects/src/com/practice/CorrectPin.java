package com.practice;
import java.util.Scanner;

public class CorrectPin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pin: ");
		int n = sc.nextInt();
		int Secretpin = 4535;
		while(n != Secretpin) {
			System.out.println("Invalid pin entered,try again");
			 n = sc.nextInt();
		}
		System.out.println("Access granted");
		sc.close();

	}

}
