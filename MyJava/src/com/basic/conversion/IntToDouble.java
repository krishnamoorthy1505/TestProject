package com.basic.conversion;

public class IntToDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    //Converson int to double
			int i=100;
			double d=i;
			System.out.println("int to double :"+d);
			
			Double dObj=new Double(i);
			double dv=dObj.valueOf(d);
			System.out.println("Double :"+dObj+" Value of "+dv);
			
			//Converson of double to int
			double douValue=200;
			int id=(int) douValue;
			
			Double d2=new Double(100.55);
			int i2=d2.intValue();
			System.out.println("id = "+id+"i2 ="+i2);
	}

}
