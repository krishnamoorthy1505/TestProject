package com.java5;

public class AutoUnboxMethod {
	/*
	 * static void m(int i) { System.out.println("int"); }
	 */
	static void m(Integer i) {
		System.out.println("Integer");
	}
	static void m(Long l) {
		System.out.println("Long");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		m(i);
		m1(10,20);

	}
	private static void m1(int... j) {
		// TODO Auto-generated method stub
		System.out.println("int int");
		
	}

}
