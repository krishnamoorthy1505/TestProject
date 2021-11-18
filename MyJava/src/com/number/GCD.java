package com.number;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=12,n2=8;
		while(n2!=0) {
			int temp=n2;
			n2=n1%n2;
			n1=temp;
		}
		System.out.println("NCD ="+n1);

	}

}
