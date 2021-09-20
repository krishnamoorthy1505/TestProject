/*A positive integer is called a spy number if the sum and product of its digits are equal.
 * 
 * n=123
 * Split in to digits (1,2,3)
 * sum=1+2+3=6   product=1*2*3=6
 * 6=6
 * sum==product spy number
 * */
package com.number;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyInput=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=keyInput.nextInt();
		int sum=0,product=1;
		int lastDigit;
		while(num>0){
			//finds the last digit of the number      
			lastDigit=num%10;
			sum=sum+lastDigit;
			product=product*lastDigit;
			//remove the last digit for given number
			num=num/10;
		}
		if(sum==product)
			System.out.println(sum+"="+product+" Spy number");
		else
			System.out.println(sum+"!="+product+" not a spy numbr");

	}

}
