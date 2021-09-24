/*Strontio numbers are those four digits numbers when multiplied by 2 give the same digit at the hundreds and tens place.
Remember that the input number must be a four-digit number.
ex
1386*2=2772 
10=7
100=7    7==7
*/

package com.number;

import java.util.Scanner;

public class StrontioNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int n=num;
		System.out.println(n*2);
		//multiply num *2
		//divided by 1000 gives the remainder remove the first digit
		//divided by 10 remove last digit
		//we get a two-digit number that are mean digits of the given number
		n=(n*2%1000)/10;
		//compares the remainder and quotient   

		if(n%10==n/10)
			System.out.println(num+" is Stronic Number");
		else
			System.out.println(num+"is not Stronic Number");
	}

}
