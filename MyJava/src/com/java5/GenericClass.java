package com.java5;

public class GenericClass <T>{
	T obj;
	void add(T obj) {
		this.obj=obj;
		
	}
	T get() {
		return obj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<Integer>gc=new GenericClass<Integer>();
		gc.add(10);
		System.out.println(gc.get());

	}

}
