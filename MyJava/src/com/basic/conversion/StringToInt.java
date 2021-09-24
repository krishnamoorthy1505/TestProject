package com.basic.conversion;

public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		String num="200";
		n=n+Integer.parseInt(num);
		System.out.println("Addition = "+n);
		
		String s=String.valueOf(n);
		System.out.println(n+100);
		//String to integer
		System.out.println(n+s);

	}

}
