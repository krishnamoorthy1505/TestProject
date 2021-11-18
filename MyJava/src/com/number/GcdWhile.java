package com.number;

public class GcdWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8,n1=10;
		while(n!=n1) {
			if(n>n1)
				n=n-n1;
			else
				n1=n1-n;
							
		}
		System.out.println("Gcd Number="+n1);

	}

}
