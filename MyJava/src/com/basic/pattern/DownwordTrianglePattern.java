package com.basic.pattern;

public class DownwordTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		for(int i=rows-1;i>=0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println("");
		}
	}

}
