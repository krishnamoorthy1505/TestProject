/*ISBN is another special number in Java. 
ISBN stands for the International Standard Book Number that is carried by almost each every book.
The ISBN is a ten-digit unique number. With the help of the ISBN, we can easily find any book. 
The ISBN number is a legal number when 1*Digit1 + 2*Digit2 + 3*Digit3 + 4*Digit4 + 5*Digit5 + 6*Digit6 + 7*Digit7 
+ 8*Digit8 + 9*Digit9 + 10*Digit10 is divisible by 11. The digits are taken from right to left.
So, if the ten-digit number is 7426985414, Digit1 and Digit10 will be 4 and 7, respectively.

ex 1
Number1: 8147852369

Sum = (1*9) + (2*6) + (3*3) + (4*2) + (5*5) + (6*8) + (7*7) + (8*4) + (9*1) + (10*8)
Sum = 9 + 12 + 9 + 8 + 25 + 48 + 49 + 32 + 9 + 80

Sum = 281
rem = 281 % 11

rem = 6 != 0
Number 8147852369 is not a legal ISBN because the remainder is not equal to the 0.
*/

package com.number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ISBNNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		long num,num1;
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader buffer=new BufferedReader(reader);
		System.out.println("Enter the 10 digit ISBN Number");
		num=Long.parseLong(buffer.readLine());
		if(checkNumber(num)) {
			System.out.println(num+"is ISBN Number");
		}
		else
			System.out.println(num+"is not a ISBN Number");

	}

	private static boolean checkNumber(long num) {
		// TODO Auto-generated method stub
		int sum=0;
		int intNumber,digit,digNumber;
		String sNumber=""+num;
		if(sNumber.length()!=10){
			return false;
		}
		for(int i=0;i<sNumber.length();i++) {
			intNumber=Integer.parseInt(sNumber.substring(i, i+1));
			//System.out.println(intNumber);
			digit=i+1;
			digNumber=digit*intNumber;
			
			sum=sum+digNumber;
		
		}
		if(sum%11==0) {
			return true;
		}
		return false;
	}

}
