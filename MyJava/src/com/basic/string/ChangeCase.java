package com.basic.string;

public class ChangeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java Program";
		StringBuffer newstr=new StringBuffer(str);
		System.out.println(newstr);
		for(int i=0;i<str.length();i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				newstr.setCharAt(i,Character.toUpperCase(newstr.charAt(i)));
				//System.out.println(newstr);
			}else if(Character.isUpperCase(str.charAt(i))){
				newstr.setCharAt(i,Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.println(newstr);

	}

}
