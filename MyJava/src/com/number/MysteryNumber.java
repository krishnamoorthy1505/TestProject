/*A number N is said to be a mystery number if the number can be expressed by the sum of two numbers. 
Note that these two numbers must be reverse of each other. It lies between 22 to 198, i.e. 22<=N<=198.

It is called mystery numbers because these are the multiples of 11,
and the sum of place values of unit (1) and tens (10) place is 11 in decimal numeration. Example
Putting the values of X and Y in the above equation.

11 ( 9+3) = 132 = 93+39

11 (6 + 8) = 154 = 68 + 86

11 (7+9 ) = 176 = 79 + 97

*/

package com.number;

import java.util.Scanner;

public class MysteryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		isMysteryNumber(num);

	}

	private static boolean isMysteryNumber(int num) {
		// TODO Auto-generated method stub
		for(int i=1;i<=num/2;i++) {
			//calling the function that reverse a number and assign it to j  
			int j=reverse(i);
			//compare sum of two numbers is equal to given number
			if(i+j==num) {
				System.out.println(i+" j="+j);
				System.out.println(num+" is a Mystery number");
				return true;
			}
			
		}
		System.out.println(num+" is not a mystery number");
		return false;
	}

	private static int reverse(int i) {
		// TODO Auto-generated method stub
		String str=Integer.toString(i);
		String s="";
		for(int k=str.length()-1;k>=0;k--) {
			s=s+str.charAt(k);
		}
		int revNum=Integer.parseInt(s);
		return revNum;
	}

}
