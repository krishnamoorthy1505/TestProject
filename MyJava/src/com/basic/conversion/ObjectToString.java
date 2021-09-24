package com.basic.conversion;
class Emp{
	
}
public class ObjectToString {
	public static void main(String[] args) {
		Emp e=new Emp();
		String s1=e.toString();
		String s2=String.valueOf(e);
		System.out.println(s1);
		System.out.println(s2);
		
		//String builder to String
		String s="hello";
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		System.out.println("String Builder  "+sb);
		String reverse=sb.toString();
		System.out.println(s);
		System.out.println(reverse);
		
		//check palindrome given string
		if(s.equals(reverse)) {
			System.out.println("Given String Palindrome");
		}else
		System.out.println("Given String Not Palindrome");
		
		
	}

}
