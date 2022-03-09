package com.java5;

public class GenericElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]= {1,2,3,4,5};
		Character[] ch= {'a','b','c'};
		printElement(a);
		System.out.println();
		printElement(ch);

	}

	private static <E>void printElement(E[] a) {
		// TODO Auto-generated method stub
		for(E e:a)
		System.out.println(e);
		
	}

}
