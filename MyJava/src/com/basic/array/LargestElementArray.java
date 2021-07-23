package com.basic.array;

public class LargestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {50,25,50,35,80};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Largest Element ="+max);
	}

}
