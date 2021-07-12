package com.basic;

import java.util.Scanner;
/* A palindrome number is a number that is same after reverse */
public class PolindromeSca {
	public static void main(String[] args) {
		
		String orginalString,reverseString="";
		System.out.println("Enter the value");
		Scanner scanner=new Scanner(System.in);
		orginalString=scanner.nextLine();
		int length=orginalString.length();
		for(int i=length-1;i>=0;i--){
			reverseString+=orginalString.charAt(i);
		}
		if(orginalString.equals(reverseString)){
			System.out.println("Polindrome");
		}else{
			System.out.println("Is not a Polindrome");
		}
		
	}

}
