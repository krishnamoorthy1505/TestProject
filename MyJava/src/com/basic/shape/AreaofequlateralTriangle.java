/*In geometry, an equilateral triangle is a triangle in which all three sides are equal.
In the familiar Euclidean geometry, equilateral triangles are also equiangular;
that is, all three internal angles are also congruent to each other and are each 60°.

√3/4 x S to the power of 2. Or Sˆ2, where S is the side of a triangle.

*/


package com.basic.shape;

import java.util.Scanner;

public class AreaofequlateralTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		double a=sc.nextDouble();
		double area=(Math.sqrt(3)/4)*(a*a);
		System.out.println("AreaofequlateralTriangle  ="+area);
		
	}

}
