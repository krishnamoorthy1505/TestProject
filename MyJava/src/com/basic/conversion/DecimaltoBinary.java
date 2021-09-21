/*
 * Divide the number by 2.
Get the integer quotient for the next iteration.
Get the remainder for the binary digit.
Repeat the steps until the quotient is equal to 0.

 * 10/2=5  rem=0
 * 5/2=2   rem=1
 * 2/2=1   rem=0
 * 1/2=0   rem=1
 * (21010)
 */
package com.basic.conversion;

public class DecimaltoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toBinaryString(10));
		toBinary(10);

	}

	private static void toBinary(int i) {
		// TODO Auto-generated method stub
		int[] binary=new int[10];
		int index=0;
		while(i>0) {
			binary[index++]=i%2;
			i=i/2;
		}
		//System.out.print(" "+binary);
		for(int j=index-1;j>=0;j--) {
			System.out.print(binary[j]);
		}
	}

}
