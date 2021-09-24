/*(1010)₂ = (1 × 2³) + (0 × 2²) + (1 × 2¹) + (0 × 2⁰) = (10)₁₀
*/
package com.basic.conversion;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String binaryString="1010";
		int decimal=Integer.parseInt(binaryString,2);
		System.out.println(decimal);

	}

}
