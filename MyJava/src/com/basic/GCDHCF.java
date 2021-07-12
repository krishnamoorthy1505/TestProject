/*Program to find the GCD and HCF
 * GCD -Greatest Common Divisor 
 * HCF -Highest Common Factor The largest number that can divide both given numbers
 * 36 - 2 * 2 * 3 * 3
 * 60 - 2 * 2 * 3 * 5
 * GCD = multiplication of common factors
*/
package com.basic;

public class GCDHCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=36,y=60;
		System.out.println("GCD of x="+x+"y="+y+"is"+gcd(x,y));
		

	}

	private static int gcd(int x, int y) {
		// TODO Auto-generated method stub
		if(x==0)
			return y;
		if(y==0)
			return x;
		if(x==y)
			return x;
		if(x>y)
			return gcd(x-y,y);
			return gcd(x,y-x);
		
		
		
	}

}
