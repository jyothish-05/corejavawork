package com.practice;
import java.util.Scanner;

public class SmallestPrimeNumber {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter starting number: ");
		int s = sc.nextInt();
		
		System.out.println("enter end number: ");
		int e = sc.nextInt();
		
		int smallestNumber = 0;
		
	    for(int i=s;i<=e;i++) {
	    	if(isprime(i)) {
	    		smallestNumber = i;
	    		break;
	    		
	    	}
	    }
	    if(smallestNumber != 0) {
	    	System.out.println("the smallest prime number between "+s+" and "+e+" is: "+smallestNumber);
	    }else {
	    	System.out.println("No prime number between the given numbers");
	    }

	}
	static boolean isprime(int n) {
		boolean status = true;
		
		if(n<2) {
			return false;
		}
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				status = false;
				break;
			}
		}
		return status;
	}
}
		
		


