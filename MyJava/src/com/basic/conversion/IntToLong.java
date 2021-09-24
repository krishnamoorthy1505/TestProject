package com.basic.conversion;

public class IntToLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=200;
		long lNum=num;
		System.out.println("Long value "+lNum);
		
		long l=200;
		int n=(int) l;
		System.out.println("Long to Int :"+n);
		
		
		Long lo=new Long(20);
		int lv=lo.intValue();
		System.out.println("Long Object to Int :"+lv);
		

	}

}
