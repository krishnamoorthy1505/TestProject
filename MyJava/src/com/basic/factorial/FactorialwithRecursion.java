/*Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!.
4! = 4*3*2*1 = 24  
5! = 5*4*3*2*1 = 120  
*/

package com.basic.factorial;
import java.util.Scanner;

public class FactorialwithRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		long fact=FactorialwithRecursion.factorial(n);
		System.out.println("Fact ="+fact);
	}

	private static long factorial(long n) {
		// TODO Auto-generated method stub
		//System.out.println(n);
		if(n<=0)
			return 1;
		    
			return FactorialwithRecursion.factorial(n-1) * n;
			
		
		
	}

}
