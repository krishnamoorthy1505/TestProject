/*In an integer traversing from left to right if the current digit is greater than or equal to the previous digit,
the number is known as increasing numbers. In other words, we can say that if no digit is exceeded by the digit 
to its left is called increasing numbers. For example, 1233, 13689, 112334566, etc.

In an integer traversing from left to right if the current digit is less than the previous digit, 
the number is known as decreasing numbers. In other words, we can say that if no digit is exceeded 
by the digit to its right is called decreasing numbers. 
 For example, 321, 88531, 8755321
 
 A positive integer that is neither in increasing nor decreasing number is called a bouncy number
 For example, 
 
 123742, 101, 43682, etc. We observe that in the given number's digits are neither 
 increasing nor decreasing if we traverse from left to right, hence they are called bouncy numbers.


*/package com.number;

import java.util.Scanner;

public class BouncyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		if(isIncreasing(num) || isDecreasing(num) || num<101) {
			System.out.println(num+" is not a BouncyNumber");
		}
		else
			System.out.println(num+" is  a bouncy number");

	}

	private static boolean isDecreasing(int num) {
		// TODO Auto-generated method stub
		String strNum=Integer.toString(num);
		boolean flag=true;
		char digit;
		for(int i=0;i<strNum.length()-1;i++) {
			digit=strNum.charAt(i);
			if(digit<=strNum.charAt(i+1)) {
				flag=false;
				break;
			}
		}
		return flag;
	}

	private static boolean isIncreasing(int num) {
		// TODO Auto-generated method stub
		String strNumber=Integer.toString(num);
		boolean flag=true;
		char digit;
		for(int i=0;i<strNumber.length()-1;i++) {
			digit=strNumber.charAt(i);
			System.out.println(digit+" "+strNumber.charAt(i+1));
			if(digit>=strNumber.charAt(i+1)) {
				flag =false;
				break;
			}
		}
		
		return flag;
	}

}
