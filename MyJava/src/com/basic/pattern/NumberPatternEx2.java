package com.basic.pattern;

public class NumberPatternEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k=1,n=7;
		for(i=1;i<=n;i++) {
			for(j=1;j<i+1;j++) {
				System.out.print(k++ +" ");
			}
			System.out.println("");
		}
	}

}
