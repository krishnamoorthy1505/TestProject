package com.basic.pattern;

public class ReversePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=7,j,i;
		i=number;
		while(i>0){
			j=0;
			while(j++<number-i){
				System.out.print(" ");
			}
			j=0;
			while(j++<(i*2)-1){
				System.out.print("*");
			}
			System.out.println();
			i--;
		}
        
	}

}
