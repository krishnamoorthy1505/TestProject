package com.basic.pattern;

public class DownTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i,j,n=7;
			for(i=n;i>=1;i--) {
				for(j=i;j<=n;j++) {
					System.out.print(" ");
				}
				for(j=1;j<=(2*i-1);j++) {
					if(j==1 || i==n || j==(2*i-1))
					{			
					System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
	}

}
