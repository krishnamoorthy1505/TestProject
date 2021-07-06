/*An isosceles triangle is a triangle where any two sides of a triangle 
should be equal both in terms of length and angles. Below is the sample figure.

[ B/4√((4*a*a)-(b*b)) ]


*/

package com.basic.shape;

import java.util.Scanner;

public class IsoscelesTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the a value");
		double a=input.nextDouble();
		System.out.println("Enter the b value");
		double b=input.nextDouble();
		double area=(b/4)*Math.sqrt((4*a*a)-(b*b));
		System.out.println("Area of IsoscelesTriangle ="+area);

	}

}
