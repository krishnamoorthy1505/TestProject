package com.java5;
class A1{
	A1 foo() {
		return this;
	}
	void print() {
		System.out.println("A1");
	}
}
class A2 extends A1{
	@Override
	A2 foo() {
		return this;
		//System.out.println("A2");
	}
	void print() {
		System.out.println("A2");
	}
}
class A3 extends A2{
	A3 foo() {
		return this;
	}
	void print() {
		System.out.println("a3");
	}
}

public class Covariant {

	public static void main(String[] args) {
		A1 a1=new A1();
		a1.foo().print();
		// TODO Auto-generated method stub
		
		A2 a2=new A2();
		a2.foo().print();

		
		A3 a3=new A3();
		a3.foo().print();
	}

}
