/*A number is said to be Krishnamurthy if the factorial sum of all its digits is equal to that number(Strong number)
 * Number = 145  
= 1! + 4! + 5!  
= 1 + ( 4 * 3 * 2 * 1 ) + ( 5 * 4 * 3 * 2 * 1 )  
= 1 + 24 + 120  
145= 145  

 * */
package com.number;

import java.util.Scanner;

public class KrishnamoorthyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyInput=new Scanner(System.in);
		int number=keyInput.nextInt();
		
		if(checkNumber(number)) {
			System.out.println(number+" is a krishnamoorthy number");
		}
		else
			System.out.println(number+" is not a krishnamoorthy number");

	}

	private static boolean checkNumber(int number) {
		// TODO Auto-generated method stub
		int sum=0;
		int temp=number;
		while(temp!=0) {
			//calculate the lastdigit sum and sum
			sum=sum+factorial(temp%10);
			//remove last element
			temp=temp/10;
		}
		if(sum==number)
			return true;
		return false;
	}

	private static int factorial(int i) {
		// TODO Auto-generated method stub
		//System.out.println(i);
		int f=1;

		while(i!=0) {
			f=f *i;
			i--;
		}
		return f;
	}

}
