/**
 * A number is said to be Peterson 
 * if the sum of factorials of each digit 
 * is equal to the sum of the number itself.
 * 145  =1!+4!+5! =1+24+120 =145 
 */
package com.number;

import java.util.Scanner;

public class PetersonNumber {
	static int fact[]=new int[] { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyIn=new Scanner(System.in);
		int num=keyIn.nextInt();
		if(isPetersonNumber(num))
			System.out.println(num+" Peterson number");
		else{
			System.out.println(num+"not a Peterson number");
		}
	}
	private static boolean isPetersonNumber(int num) {
		// TODO Auto-generated method stub
		int n=num;
		int sum=0;
		while(num>0){
			int digit=num%10;
			/** determines the factorial of the digit and add it to the variable sum*/  
			sum+=fact[digit];
			/** remove thelast digit given number*/	
			num=num/10;
			
			
		}
		return (n==sum);
	}

}
