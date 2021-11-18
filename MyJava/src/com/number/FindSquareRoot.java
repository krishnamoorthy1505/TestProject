/*x=√x
 * Formula
sqrtn+1=(sqrtn+(num/sqrtn))/2.0
*/

package com.number;

import java.util.Scanner;

public class FindSquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
	
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		System.out.println("SqreRoot  "+findSqrt(n));
		//int sqrRoot=n/2;
	}

	private static double findSqrt(int n) {
		// TODO Auto-generated method stub
		double temp;
		double sqrroot=n/2;
		//System.out.println("Root"+sqrroot);
		do {
			temp=sqrroot;
			//System.out.println("temp="+temp);
			sqrroot=(temp+(n/temp))/2;
			//System.out.println(sqrroot);
		}while((temp-sqrroot)!=0);
		return sqrroot;
	}

}
