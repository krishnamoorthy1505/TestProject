package com.number;

import java.util.Scanner;

public class SwappingTwoNumberBitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Scanner input1=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		System.out.println("Before Swaping a="+a+" b="+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping Bitwise Operator a="+a+" b="+b);

	}

}
