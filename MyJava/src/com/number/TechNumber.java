/**
 * A number is called a tech number if the given number has an even number of digits 
 * and the number can be divided exactly into two parts from the middle. 
 * After equally dividing the number, sum up the numbers and find the square of the sum. 
 * If we get the number itself as square, the given number is a tech number, else, not a tech number
 * 2025 =  20 | 25  20+25 =45  45*45=2025    ,2025=2025
 */
package com.number;

import java.util.Scanner;

public class TechNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num,n=0,fhValue,shValue,digit=0,sum=0;
			Scanner input=new Scanner(System.in);
			n=input.nextInt();
			num=n;
			while(num>0){
				digit++;
				num=num/10;
			}
			System.out.println(digit);
			if(digit%2==0){
				num=n;
				shValue=(int) (num%Math.pow(10, digit/2));
				fhValue=(int) (num/(Math.pow(10,digit/2)));
				sum=(shValue+fhValue)*(fhValue+shValue);
				
				if(n==sum)
					System.out.println(n+" Tech Number "+sum);
				else
					System.out.println(n+"is not a tech number"+sum);
			}
				
	}

}
