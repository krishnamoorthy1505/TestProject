/*(1010)₂ = (1 × 2³) + (0 × 2²) + (1 × 2¹) + (0 × 2⁰) = (10)₁₀
*/package com.basic.conversion;

public class BinaryToDecimalCustom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Decimal :"+getDecimal(1010));
		System.out.println("Decimal :"+getDecimal(101));

	}

	private static int getDecimal(int i) {
		// TODO Auto-generated method stub
		int decimal=0;
		int n=0;
		while(true) {
			if(i==0) {
				break;
			}
			else {
				int temp=i%10;
				decimal+=temp * Math.pow(2, n);
				i=i/10;
				n++;

			}
				
		}
		return decimal;
	}

}
