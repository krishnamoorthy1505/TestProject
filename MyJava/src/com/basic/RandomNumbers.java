package com.basic;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=200,max=400;
		System.out.println("Random value of double min="+min+"max="+max);
		double value=Math.random()*(max-min+1)+min;
		System.out.println(value);
		System.out.println("Random value of int min="+min+"max="+max);
		int value1=(int) (Math.random()*(max-min+1)+min);
		System.out.println(value1);
		
		

		
		 
		

	}

}
