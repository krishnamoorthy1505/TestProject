package com.basic.string;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="abcabc";
		System.out.println(name.substring(0));
		System.out.println(name.substring(1).length());
		System.out.println(name.substring(2));
		System.out.println(name.substring(3));
		System.out.println(name.substring(4));
		System.out.println(name.substring(5));


		System.out.println(name.substring(0, 1));
		System.out.println(name.substring(0, 2));
		System.out.println(name.substring(0, 3));
		System.out.println(name.substring(0, 6));
		System.out.println(name.substring(1, 6));
		//System.out.println(name.substring(0, 6 ));

		//System.out.println(name.substring(1, 2));


	}

}
