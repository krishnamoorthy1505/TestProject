/*There can be only one variable argument in the method.
Variable argument (varargs) must be the last argument.
void method(String... a, int... b){}//Compile time error  

*/
package com.java5;

public class VarargCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(10,"gopi","krishna");
	}

	private static void display(int i, String...strings) {
		// TODO Auto-generated method stub
		System.out.println("invoked");
		System.out.println(i +"" +strings[0]);
		for(String s : strings) {
			System.out.println(s);
		}
	}

}
