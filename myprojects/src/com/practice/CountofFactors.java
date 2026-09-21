package com.practice;

public class CountofFactors {

	public static void main(String[] args) {
		int n = 55;
		int count = 0;
		for(int i = 1;i <= n;i++) {
			if(n%i==0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Count of numbers which are factorial of "+n+ " are: "+count);

	}

}
