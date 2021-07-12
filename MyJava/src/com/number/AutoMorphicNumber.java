
/**
 * A number is called an automorphic number 
 * if and only if the square of the given number ends 
 * with the same number itself
 * 76=76*76=5776(last two digit)
 * 76=76 
 */
package com.number;

import java.util.Scanner;

public class AutoMorphicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner keyInput=new Scanner(System.in);
		int num=keyInput.nextInt();
		int count=0;
		int square=num*num;
		int temp=num;
		while(temp>0){
			count++;
			/** remove last digit of number */
			temp=temp/10;
			
		}
		
		int lastDigit=(int)(square%(Math.pow(10,count)));
		
		if(num == lastDigit)
			System.out.println(num+"Automorphic number");
		else
			System.out.println(num+"Is not a automorphic number");
		

	}

}
