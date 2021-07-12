package com.basic.shape;

import java.util.Scanner;

/**
 * @author DELL 3542
 *
 */
public class AreaofTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner height=new Scanner(System.in);
		System.out.println("Enter the height vlue =");
		
				
		double h=height.nextDouble();
		System.out.println("Enter the base value =\n");
		//Scanner base=new Scanner(System.in);
		
		double b=height.nextDouble();
		
		
		areaOfTriangle(h,b);
		

	}

	private static void areaOfTriangle(double h, double b) {
		// TODO Auto-generated method stub
		double area=((h*b)/2);
		System.out.println("Area of Tiangle ="+area);
		
	}

}
