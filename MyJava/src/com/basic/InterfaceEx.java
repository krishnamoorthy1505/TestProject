package com.basic;
interface A{
	int x=10;
}
interface B{
	int x=20;
}
public class InterfaceEx implements A,B{
	public static void main(String[] args) {
		//A a=new InterfaceEx();
		System.out.println(A.x);
		System.out.println(B.x);
		//System.out.println(x);
	}
}
