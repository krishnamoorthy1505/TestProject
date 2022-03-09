package com.java8;
interface A{
	default void a() {
		System.out.println("A");
	}
}

interface B extends A{
	void b();
}
public class FunctionalInterface implements B {
	public void b() {
		System.out.println("B");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterface fi=new FunctionalInterface();
		fi.b();
		fi.a();
		

	}

}
