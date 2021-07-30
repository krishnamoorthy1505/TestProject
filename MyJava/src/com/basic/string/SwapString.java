package com.basic.string;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="good";
		String str2="morning";
		str1=str1+str2;
		System.out.println(str1);
		str2=str1.substring(0,(str1.length()-str2.length()));
		System.out.println(str2);
		str1=str1.substring(str2.length());
		System.out.println(str1);
		System.out.println("After Swapping "+str1+" "+str2);
		
	}

}
