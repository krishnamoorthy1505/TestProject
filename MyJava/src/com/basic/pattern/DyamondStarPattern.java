package com.basic.pattern;

public class DyamondStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,rows=5;
		for(i=1;i<=rows;i++) {
			for(j=rows;j>i;j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(j=1;j<2*(i-1);j++) {
				System.out.print(" ");
			}
			if(i==1) {
				System.out.println("");
			}
			else {
				System.out.println("*");
			}
		}
		for(i=rows-1;i>=1;i--) {
			for(j=rows;j>i;j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(j=1;j<2*(i-1);j++) {
				System.out.print(" ");
			}
			if(i==1) {
				System.out.println("");
			}
			else {
				System.out.println("*");
			}
		

	}
}
}
