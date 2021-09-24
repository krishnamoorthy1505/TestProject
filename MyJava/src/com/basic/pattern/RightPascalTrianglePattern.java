package com.basic.pattern;

public class RightPascalTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=8;
		int i,j;
		for(i=0;i<=rows-1;i++)
		{
			
			for(j=0;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println("");
		}
		for(i=rows-1;i>=0;i--) {
			for(j=0;j<i-1;j++) {
				System.out.print("*"+" ");
			}
			System.out.println("");
		}
		
	}

}
