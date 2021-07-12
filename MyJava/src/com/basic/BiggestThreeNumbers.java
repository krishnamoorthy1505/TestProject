package com.basic;

public class BiggestThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=55,c=45;
		int largest;
		largest=findBiggestNumber(a,b,c);
		System.out.println("Largest Number="+largest);

	}

	private static int findBiggestNumber(int a, int b, int c) {
		// TODO Auto-generated method stub
		
		return c>(a>b?a:b)?c:(a>b?a:b);
	}

}
