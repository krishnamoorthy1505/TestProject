package com.basic;

import javax.swing.text.Element;

public class GenericElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer intArr[]= {10,20,30,40};
		Character[] charArr= {'A','B'};
		printArr(intArr);
		printArr(charArr);

	}

	private static  <E> void printArr(E[] elements) {
		// TODO Auto-generated method stub
		for(E e : elements) {
			System.out.println(e);
		}
		System.out.println();
		
	}

}
