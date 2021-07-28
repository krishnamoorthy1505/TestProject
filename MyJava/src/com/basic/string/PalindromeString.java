package com.basic.string;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String paliString="Kayak";
		boolean flag=true;
		paliString=paliString.toLowerCase();
		for(int i=0;i<paliString.length()/2;i++) {
			if(paliString.charAt(i)!=paliString.charAt(paliString.length()-i-1)) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("Given string is Palindrome");
		}
		else {
			System.out.println("Given string is not Palindrome");
		}
	}

}
