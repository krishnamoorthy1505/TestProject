package com.number;

import java.util.Scanner;

public class FindSquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		System.out.println("SqreRoot  "+findSqrt(n));
		//int sqrRoot=n/2;
	}

	private static int findSqrt(int n) {
		// TODO Auto-generated method stub
		int temp;
		int sqrroot=n/2;
		do {
			temp=sqrroot;
			sqrroot=(temp+(n/temp))/2;
		}while((temp-sqrroot)!=0);
		return sqrroot;
	}

}
