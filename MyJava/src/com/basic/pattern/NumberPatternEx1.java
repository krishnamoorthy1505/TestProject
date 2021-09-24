package com.basic.pattern;

public class NumberPatternEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,num,n=7;
		for(i=0;i<n;i++) {
			num=1;
			for(j=0;j<=i;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println("");
		}
	}

}
