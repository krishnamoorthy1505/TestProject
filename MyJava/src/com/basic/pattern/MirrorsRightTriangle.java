package com.basic.pattern;

public class MirrorsRightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		for(int i=0;i<=rows;i++) {
			for(int j=0;j<rows-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
