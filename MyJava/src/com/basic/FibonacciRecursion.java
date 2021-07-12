package com.basic;

/*In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.*/ 
public class FibonacciRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=10;
		System.out.print(" "+n1+" "+n2);
		fibonacci(count-2);
		
		

	}
    static int n1=0,n2=1,n3=0,i;
	private static void fibonacci(int count) {
		// TODO Auto-generated method stub
		if(count>0)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			fibonacci(count-1);
			
		}
	}
	

}
