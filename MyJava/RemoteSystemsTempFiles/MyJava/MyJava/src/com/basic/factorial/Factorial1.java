package com.basic.factorial;

import java.util.Scanner;

public class Factorial1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		n=(int) sc.nextLong();
		for(int i=1;i<=n;i++){
			fact=i*fact;
		}
		System.out.println("factorial="+fact);

	}

}
