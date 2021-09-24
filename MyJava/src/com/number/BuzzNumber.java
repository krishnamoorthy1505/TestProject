/*Buzz number is another special number in Java that ends with digit 7 or divisible by 7.*/
package com.number;


import java.util.Scanner;

import com.basic.CheckPrimeNumber;

public class BuzzNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner keyNum1=new Scanner(System.in);
		//Scanner keyNum2=new Scanner(System.in);
		num1=keyNum1.nextInt();
		if(CheckPrimeNumber(num1)) 
			System.out.println(num1+" is a Buzz number");
		else
			System.out.println(num1+"is not a Buzz number");
		
		

	}

	private static boolean CheckPrimeNumber(int num1) {
		// TODO Auto-generated method stub
		if(num1%10==7 || num1%7==0)
				return true;
			else
				return false;
	}

}
