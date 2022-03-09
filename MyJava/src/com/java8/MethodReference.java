package com.java8;

import java.util.function.BiFunction;


interface Sayable{
	void say();
}
class Arithmetic{
	//public static BiFunction<Integer, Integer, Integer> add;

	//public static BiFunction<T, U, R> add;

	public static int add(int a,int b) {
		return a+b;
	}
	public float add(int a,float b) {
		return a+b;
	}
}
public class MethodReference {
	public static void saySomething() {
		System.out.println("Say");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable say=MethodReference::saySomething;
		say.say();
		BiFunction<Integer, Integer, Integer> bi=Arithmetic::add;
		int result=bi.apply(10, 10);
		System.out.println(result);
		
		BiFunction<Integer, Float, Float> add=new Arithmetic()::add;
		float res = add.apply(100, 100.0f);
		System.out.println(res);
		
		

	}

}
