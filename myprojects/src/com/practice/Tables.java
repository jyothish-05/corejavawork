package com.practice;
import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter which table you need: ");
		int n = sc.nextInt();
		
		table(n);
		sc.close();

	}
	static void table(int n) {
		for(int i = 1;i <= 10;i++) {
			System.out.println(n+" x "+i+" = "+(n*i));
		}
	}

}
