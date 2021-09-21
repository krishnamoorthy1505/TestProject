package com.basic.conversion;

public class StringToChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value="hello";
		char ch[]=value.toCharArray();
		for(int i=0;i<value.length();i++)
			System.out.print(" "+ch[i]);
		
		//char to string
		char c='c';
		String charString=String.valueOf(c);
		//System.out.println();
		System.out.println( "\nChar String "+charString);
	}

}
