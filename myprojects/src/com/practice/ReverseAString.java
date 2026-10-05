package com.practice;

public class ReverseAString {

	public static void main(String[] args) {
		String name = "Karthik";
		String rev = "";
		for(int i = name.length()-1;i>=0;i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);

	}

}
