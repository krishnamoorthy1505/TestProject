/**
 * First, we find the remainder of the given number by using the modulo (%) operator.
Multiply the variable reverse by 10 and add the remainder into it.
Divide the number by 10.

 */
package com.number;

public class ReverseNumber {
	public static void main(String[] args) {
		int number=54321,reverse=0;
		while(number!=0){
			int reminder=number%10;
			reverse=reverse*10+reminder;
			number=number/10;
		}
		System.out.println("Reverse Number is="+reverse);
	}
	

}
