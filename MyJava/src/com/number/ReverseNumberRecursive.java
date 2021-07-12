package com.number;

import java.util.Scanner;

public class ReverseNumberRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number :");
		Scanner input=new Scanner(System.in);
		int number =input.nextInt();
		System.out.println("Reverse number is :");
		reverseNumber(number);

	}

	private static void reverseNumber(int number) {
		// TODO Auto-generated method stub
		if(number<10){
			System.out.println(number);
			return;
		}
		else{
			System.out.print(number%10);
			reverseNumber(number/10);
		}
		
	}

}
