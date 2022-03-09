package com.java8;

interface Addition1{
	int add(int a,int b);
}

public class LambadaExp1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition1 add=(a,b)->{
			return a+b;
		};
	System.out.println(add.add(10,20));
	}

}
