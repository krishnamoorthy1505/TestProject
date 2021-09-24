package com.basic.pattern;

public class SandGlassPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int n=5;
		for(i=0;i<=n-1;i++) {
			for(j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(j=i;j<=n-1;j++) {
				System.out.print("*"+" ");
			}
			System.out.println("");
		}
		for(i=n-1;i>=0;i--){
			for(j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(j=i;j<=n-1;j++) {
				System.out.print("*"+" ");
			}
			System.out.println("");
		}

	}

}
