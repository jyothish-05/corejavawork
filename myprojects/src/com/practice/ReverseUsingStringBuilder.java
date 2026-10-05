package com.practice;

public class ReverseUsingStringBuilder {

	public static void main(String[] args) {
		String name = "Jaya chandra";
		
		String rev = new StringBuilder(name).reverse().toString();
		
		System.out.println(rev);

	}

}
