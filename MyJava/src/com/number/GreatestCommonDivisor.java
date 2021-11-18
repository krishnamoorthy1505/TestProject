/*Factors of 12: 1, 2, 3, 4, 6, 12

Factors of 8: 1, 2, 4, 8

Common Factors: 1, 2, 4

Greatest Common Factor: 4

Hence, the GCF of 12 and 8 is 4.
*/

package com.number;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=12,y=8,gcd=1;
		for(int i=1;i<=x && i<=y;i++) {
			if(x%i==0 && y%i==0) {
				gcd=i;
			}
		}
		System.out.printf("x=%d y=%d is gcd="+x,y,gcd);
		
		

	}

}
