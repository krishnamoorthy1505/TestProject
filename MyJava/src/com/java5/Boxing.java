package com.java5;

public class Boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boxing
		int i=20;
		Integer i1 = new Integer(i);
		Integer i2=20;
		System.out.println(i1+i2);
		
		//unboxing
		int i3=i1;
		System.out.println(i3);
		if(i1>10)
			System.out.println("Internally Unboxing");

	}

}
