package com.number;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class LargestNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3,temp,num;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The First Number : ");
		n1 = input.nextInt();
		System.out.println("Enter The Second Number");
		n2=input.nextInt();
		System.out.println("Enter The Third Number :");
		n3=input.nextInt();
		temp=n1>n2?n1:n2;
		num=temp>n3?temp:n3;
		System.out.println("Largest Number   :"+num);
		
		num = n3>(n1>n2?n1:n2)?n3:((n1>n2)?n1:n2);
		System.out.println("Largest "+num);

	}

}
