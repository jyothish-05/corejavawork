package com.practice;

public class StringPalindrome {

	public static void main(String[] args) {
		String name = "level";
		
		String rev = "";
		
		for(int i = name.length()-1;i>=0;i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(name)) {
			System.out.println("the given word is palindrome");
		}else {
			System.out.println("the given word is not a palindrome");
		}

	}

}
