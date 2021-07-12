package com.basic.pattern;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=4,k=0,count=0,count2=0;
		for(int i=1;i<=rows;i++){
			
			for(int space=1;space<=rows-i;space++){
				
				System.out.print(" ");
				count++;
			}
			
			while(k!=2*i-1){
				
				/*column count less than row size i+k*/
				if(count<=rows-1){
					System.out.print((i+k)+"");
					count++;
					
				}
				/*column count greater than row size*/
				else{
					count2++;
					System.out.print((i+k-2*count2)+"");
					
				}
				k++;
			}
			count=count2=k=0;
			System.out.println(" ");
		}
	
		

	}

}
