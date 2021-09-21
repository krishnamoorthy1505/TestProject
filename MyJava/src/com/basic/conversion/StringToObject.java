package com.basic.conversion;

public class StringToObject {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		String s="hello";
		Object o=s;
		System.out.println(o);
		
		Class c=Class.forName("java.lang.String");
		System.out.println("Class Name"+c.getName());
		System.out.println("Super Class Name"+c.getSuperclass().getName());
		
	}
}
