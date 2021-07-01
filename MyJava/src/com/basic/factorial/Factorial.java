package com.basic.factorial;

/*Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!.
4! = 4*3*2*1 = 24  
5! = 5*4*3*2*1 = 120  
*/

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println(" Fact ="+fact);	

	}

}
