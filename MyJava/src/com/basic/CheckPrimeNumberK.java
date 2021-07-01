package com.basic;

import java.util.Scanner;
/*Prime number is a number that is greater than 1 and divided by 1 or itself only. */

public class CheckPrimeNumberK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int value=input.nextInt();
		if(isPrime(value)){
			System.out.println("Is a prime number");
		}
		else{
			System.out.println("Is not a prime number");
		}

	}

	private static boolean isPrime(int value) {
		// TODO Auto-generated method stub
		if(value<=1){
			return false;
		}else{
			System.out.println("Math.sqrt="+Math.sqrt(value));
			for (int i=2;i<=Math.sqrt(value);i++){
				if(value%i==0){
					return false;
				}
			}
		}
			
		return true;
	}

}
