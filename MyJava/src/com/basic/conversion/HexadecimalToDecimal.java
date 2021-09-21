/*(123)₁₆ = (1 × 16²) + (2 × 16¹) + (3 × 16⁰) = (291)₁₀
(1DA)₁₆ = (1 × 16²) + (13 × 16¹) + (10 × 16⁰) = (474)₁₀
HexaDecimal=0123456789ABCDEF(0-15)
Decimal =0123456789
*/
package com.basic.conversion;

public class HexadecimalToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hex="1a";
		System.out.println(Integer.parseInt(hex,16));
		System.out.println("HexaToDecimal "+decimal("123"));

	}

	private static int decimal(String hex) {
		// TODO Auto-generated method stub
		String digits="0123456789ABCDEF";
		hex=hex.toUpperCase();
		int val=0;
		for(int i=0;i<hex.length();i++) {
			char c=hex.charAt(i);
			int d=digits.indexOf(c);

			val=16 * val+d;
			//System.out.print(" "+i+" c="+c+" d="+d+" v="+val);


		}
		return val;
	}

}
