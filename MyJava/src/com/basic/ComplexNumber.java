/**
 * 
 */
package com.basic;

/**
 * @author DELL 3542
 *
 */
public class ComplexNumber {

	/**
	 * 
	 */
	int image,real;
	public ComplexNumber() {
		// TODO Auto-generated constructor stub
	}
	public ComplexNumber(int a,int b){
		this.real=a;
		this.image=b;
		
	}
	public void show(){
		System.out.println(this.real+" i"+this.image);
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexNumber complex1=new ComplexNumber(4, 5);
		ComplexNumber complex2=new ComplexNumber(10, 5);
		System.out.println("First Complex Number =");
		complex1.show();
		System.out.println("Second Complex Number=");
		complex2.show();
		ComplexNumber result=add(complex1,complex2);
		System.out.println("Complex Addition");
		result.show();

		
	}
	private static ComplexNumber add(ComplexNumber complex1, ComplexNumber complex2) {
		// TODO Auto-generated method stub
		ComplexNumber res=new ComplexNumber(0,0);
		res.real=complex1.real+complex2.real;
		res.image=complex1.image+complex2.image;
		return res;
	}
	

}
