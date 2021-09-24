package com.basic.pattern;

public class LeftPascleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=7;
		int i,j;
		for(i=0;i<=rows;i++) {
			for(j=i;j<=rows;j++) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(i=rows;i>=0;i--) {
			for(j=i;j<=rows;j++) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
