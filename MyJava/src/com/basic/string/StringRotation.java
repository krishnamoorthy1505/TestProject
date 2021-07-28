package com.basic.string;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="abcde",str2="edcba";
		if(str1.length()!=str2.length())
			System.out.println("Second string is not rotate for first string");
		else {
			str1=str1.concat(str2);
			System.out.println(str1);
			System.out.println(str1.indexOf(str2));
			if(str1.indexOf(str2)!=-1) {
				System.out.println("Second string is rotate for first string");
			}
			else {
				System.out.println("second sting is not rotate for first string");
			}
		}

	}

}
