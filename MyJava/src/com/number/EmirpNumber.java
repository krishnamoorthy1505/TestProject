/* emirp number if we get another prime number on reversing the number itself.
In other words, an emirp number is a number that is prime forwards or backward. 
It is also known as twisted prime numbers.
ex;79 is a prime number
reverse 97 is prime number

*/


package com.number;

import java.util.Scanner;

public class EmirpNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyInput=new Scanner(System.in);
		System.out.println("Enter the number");

		int num=keyInput.nextInt();
		if(isEmirp(num)==true)
			System.out.println(num +"is EmirpNumber");
		else
			System.out.println(num +"  is not a emirpnumber");				


	}

	private static boolean isEmirp(int num) {
		// TODO Auto-generated method stub
		if(isPrime(num)==false)
		return false;
		int reverse=0;
		while(num!=0){
			int lastDigit=num%10;
			reverse=reverse*10+lastDigit;
			num=num/10;
		}
		return isPrime(reverse);
	}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		if(num<=1)
			return false;
		for(int i=2;i<num;i++)
			if(num%i == 0)
				return false;
			else
				return true;
			
		return false;
	}

}
