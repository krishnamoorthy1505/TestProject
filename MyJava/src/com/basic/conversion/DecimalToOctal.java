/*Divide the number by 8.
Get the integer quotient for the next iteration.
Get the remainder for the octal digit.
Repeat the steps until the quotient is equal to 0.
ex: 8  8/8  Q=1  rem=0
       1/8  Q=0  rem=1
Ans=10
ex :19 19/8  q=2 rem=3
       2/8   q=0 rem=2  
Ans=23;
*/

package com.basic.conversion;

public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Decimal to octal of 8 is: "+getOctal(8));  

		System.out.println("Decimal to Octal :"+getOctal(19));
	}

	private static String getOctal(int decimal) {
		// TODO Auto-generated method stub
		int rem=0;
		char[] octalVal= {'0','1','2','3','4','5','6','7'};
		String oct="";
		while(decimal>0) {
			rem=decimal%8;
			oct=octalVal[rem]+oct;
			decimal=decimal/8;
		}
		return oct;
	}

}
