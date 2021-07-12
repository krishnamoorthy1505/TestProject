package com.basic;

/*In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. */



public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3,i,count=10;
		for(i=2;i<=count;i++){
			n3=n1+n2;
			System.out.println("i="+i+"="+n3);
			n1=n2;
			n2=n3;
		}
        
	}

}
