package com.basic;


public class SwapingTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=10,n=5;
		System.out.println("m="+m+"n="+n);
		swppingWithout3Variable(m,n);

	}

	private static void swppingWithout3Variable(int m, int n) {
		// TODO Auto-generated method stub
		 m=m-n;
		// System.out.println(" "+m);
		 n=m+n;
		 //System.out.println("n= "+n);
		 m=n-m;
		 System.out.println("m="+m+" n="+n);
		
	}

}
