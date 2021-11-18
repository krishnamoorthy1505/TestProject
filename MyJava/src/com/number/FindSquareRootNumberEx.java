/*x=√x
 * Formula
sqrtn+1=(sqrtn+(num/sqrtn))/2.0
*/
package com.number;

import java.util.Scanner;

public class FindSquareRootNumberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number=0,sqrt=0;
		Scanner sc=new Scanner(System.in);
		number=sc.nextDouble();
		sqrt=sqrtRoot(number);
		System.out.println("Squart"+sqrt);

	}

	private static double sqrtRoot(double number) {
		// TODO Auto-generated method stub
		int i=1;
		while(true) {
			//perfect square number
			if(i*i==number)
				return i;
			//if not a perfect square
			else if(i*i>number) 
				return  doubleSquareRoot(number,i-1,i);
			
			i++;
				
		}
		
	}

	private static double doubleSquareRoot(double number, double i, double i2) {
		// TODO Auto-generated method stub
		System.out.println(number+i+i2);
		double midvalue=(i+i2)/2;
		double square=midvalue*midvalue;
		//System.out.println("midvalue"+midvalue);
		//System.out.println("SQRT"+square);
		if(square==number || Math.abs(square-number)<0.0000001) 
			return midvalue;
			
		else if(square>number) 
			return doubleSquareRoot(number, i, midvalue);
		else 
			return doubleSquareRoot(number, midvalue, i2);
		
		
		
	}

}
