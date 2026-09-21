package com.practice;

public class CountDivisibleNumbers {

	public static void main(String[] args) {
		int count = 0;
		for(int i = 1;i <=100;i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i+" ");
				count++;
			}
		}
	    System.out.println();
		System.out.println("Numbers which are divisible by 3 and 5 between 1 and 100 are: "+count);
		
		

	}

}
