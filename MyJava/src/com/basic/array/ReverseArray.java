package com.basic.array;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,2,3,4,5,6};
		System.out.println("Orginal Array");
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);
		System.out.println();
		for(int j=arr.length-1;j>=0;j--)
			System.out.print(" "+arr[j]);
				
		

	}

}
