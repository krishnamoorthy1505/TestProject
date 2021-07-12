package com.basic;

import java.util.Scanner;

interface AreaCircle{
	void circle();

	void circle(double d);
}
public class AreaCircleInterface implements AreaCircle {
	double area;
	
	/**
	 * @param args
	 */
	@Override
	
	public void circle(double r) {
		// TODO Auto-generated method stub
		area=(22*r*r)/7;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaCircleInterface aci;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius   :");
		double d=sc.nextDouble();
		aci=new AreaCircleInterface();
		aci.circle(d);
		System.out.println("Area of circle is   :"+aci.area);

	}
	@Override
	public void circle() {
		// TODO Auto-generated method stub
		
	}

	

}
