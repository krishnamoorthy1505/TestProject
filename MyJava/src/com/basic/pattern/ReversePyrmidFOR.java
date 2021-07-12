package com.basic.pattern;

public class ReversePyrmidFOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7;
		int i,j;
		for(i=num;i>=1;i--){
			//System.out.print("i="+i);
			for(j=i;j<num;j++){
				//System.out.println("j="+j);
				System.out.print(" ");
			}
			for(j=1;j<=(2*i-1);j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
