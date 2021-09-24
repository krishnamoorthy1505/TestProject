package com.basic.pattern;

public class DyamondPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		int i,j;
		int space=1;
		space=rows-1;
		for(i=1;i<=rows;i++) {
			for(j=1;j<=space;j++) {
				System.out.print(" ");
			}
			space--;
			for(j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		space=1;
		for(i=1;i<=rows-1;i++) {
			for(j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=2*(rows-i)-1;j++) {
				System.out.print("*");
			}
			space++;
			System.out.println("");
		}

	}

}
