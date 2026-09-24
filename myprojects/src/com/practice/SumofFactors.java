package com.practice;

public class SumofFactors {

	public static void main(String[] args) {
		int n = 100;
		int sum = 0;
		for(int i = 1;i <= n/2;i++) {
			if(n%i==0) {
				sum+=i;
				System.out.println(i);
			}
		}
		System.out.println("The sum of factors of the given number: "+sum);

	}

}
