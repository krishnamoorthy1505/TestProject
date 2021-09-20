package com.basic.string;

public class AllSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="fun";
		int len=str.length();
		int temp=0;
		
		String subArr[]=new String[len*(len+1)/2];
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				subArr[temp]=str.substring(i,j+1);
				temp++;
				
			}
		}
		
		for(int i=0;i<subArr.length;i++)
			System.out.println(subArr[i]);

	}

}
