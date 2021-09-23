/*The digit zero should not be presented at the starting of the number. 
Zero can be present at any of the positions except the beginning of the number.
*/
package com.number;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner keyIn=new Scanner(System.in);
		number=keyIn.nextInt();
		if(checkNumber(number))
			System.out.println(number+" is a duck number");
		else
			System.out.println(number+" is not a duck number");
	}

	private static boolean checkNumber(int number) {
		// TODO Auto-generated method stub
		while(number!=0) {
			//check last number 0 or not
			if(number%10==0)
				return true;
			//Remove last digit
			number=number/10;
		}
		return false;
	}

}
