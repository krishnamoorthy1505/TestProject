//There can be only one variable argument in the method.
//Variable argument (varargs) must be the last argument.

package com.java5;

public class JavaVararg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
		display("gopi","krishna","padma");
	}

	private static void display(String... str) {
		// TODO Auto-generated method stub
		System.out.println("invoked");
		for(String s:str)
			System.out.println(s);
	}

}
