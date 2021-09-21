/*121 = (1 × 8²) + (2 × 8¹) + (1 × 8⁰) = 81
 * 23 = (2 × 8¹) + (3 × 8⁰) = 19
*/
package com.basic.conversion;

public class OctalToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Octal to Decimal "+getDecimal(121));
		System.out.println("Octal to Decimal "+getDecimal(23));


	}

	private static int getDecimal(int octal) {
		// TODO Auto-generated method stub

		int decimal=0;
		int n=0;
		while(true) {
			if(octal==0) {
                break;
			}
			else {
				int rem=octal%10;
				decimal+=rem * Math.pow(8, n);
				octal=octal/10;
				n++;
				//System.out.println("decimal"+decimal);
			}

		}
		return decimal;

	}

}
