/*
 * Divide the number by 16.
Get the integer quotient for the next iteration.
Get the remainder for the hex digit.
Repeat the steps until the quotient is equal to 0.

 * ex:1 Decimal=10  10/66  Q=0 Remainder=10  Hex=A
 * ex 2 
 * decimal=7562 7562/16  Q=472 rem=10   Hex=A
 *               472/16  Q=29  rem=8    Hex=8
 *               29/16   Q=1   rem=13   hex=D
 *               1/16    Q=0   rem=1    Hex=1
 * (7562)10 = (1D8A)16            
 */
package com.basic.conversion;

public class DecimalToHexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toHexString(10));
		System.out.println(Integer.toHexString(15));
		
		System.out.println("Decimal To Hexadecimal value  :"+toHex(10));
		System.out.println("Decimal To Hexadecimal value  :"+toHex(7562));



	}

	private static String toHex(int decimal) {
		// TODO Auto-generated method stub
		int rem;
		String hex="";
		char[] hexChar= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(decimal>0) {
			rem=decimal%16;
			hex=hexChar[rem]+hex;
			decimal=decimal/16;
		}
		return hex;
	}
	
	

}
