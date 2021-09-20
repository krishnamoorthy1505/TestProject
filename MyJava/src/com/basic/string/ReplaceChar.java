package com.basic.string;

public class ReplaceChar {
	public static void main(String[] args) {
		String str="Replace ths space";
		char c='-';
		System.out.println(str);
		str=str.replace(' ',c);
		System.out.println(str);
	}

}
