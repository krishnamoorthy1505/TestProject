package com.basic.string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="java string";
		String revString="";
		for(int i=name.length()-1;i>=0;i--) {
			revString=revString+name.charAt(i);
			
			
		}
		System.out.println(name+" "+revString);
	}

}
