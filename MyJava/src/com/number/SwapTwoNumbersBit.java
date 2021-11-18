package com.number;

import java.util.Scanner;

public class SwapTwoNumbersBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner keyInput=new Scanner(System.in);
		System.out.println("Enter the Number");
		a=keyInput.nextInt();
		System.out.println("Enter the second number");
		b=keyInput.nextInt();
		System.out.println("Before Swapping a="+a+" b="+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("Before Swapping a="+a+" b="+b);

	}

}
