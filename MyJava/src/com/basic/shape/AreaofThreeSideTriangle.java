/*
 * s(s-a)(s-b)(s-c)*/
package com.basic.shape;

import java.util.Scanner;

public class AreaofThreeSideTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the a value =");
		int a=s1.nextInt();
		System.out.println("Enter tha b value =");
		int b=s1.nextInt();
		System.out.println("Enter the c value");
		int c=s1.nextInt();
		if((a+b)>c && (a+c)>b && (b+c)>a){
			int s=(a+b+c)/2;
			System.out.println(s);
			double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
			System.out.println("Area of Triangle"+area);
		}
		else
			System.out.println("Area of Triangle not exit");

	}

}
