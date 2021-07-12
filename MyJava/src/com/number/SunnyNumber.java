/**
 * A number is called a sunny number 
 * if the number next to the given number is a perfect square.
 *  In other words, a number N will be a sunny number 
 *  if N+1 is a perfect square.
 *  n=80  n+1=81 square=9sunny number
 *  10     11  not square nit sunny number
 */
package com.number;

import java.util.Scanner;

public class SunnyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyIn=new Scanner(System.in);
		System.out.println("Enter the value");
		int num=keyIn.nextInt();
		isSunnyNumber(num);

	}

	private static void isSunnyNumber(int num) {
		// TODO Auto-generated method stub
		if(perfectSquareNum(num+1))
			System.out.println(num+"is a sunny number");
			else{
				System.out.println(num+"is not a sunny number");
			}
			
		
	}

	private static boolean perfectSquareNum(int i) {
		// TODO Auto-generated method stub
		double squareRoot=Math.sqrt(i);
		//System.out.println(squareRoot);
		//System.out.println(Math.floor(squareRoot));
		return (squareRoot-Math.floor(squareRoot)==0);
	}

}
