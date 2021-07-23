package com.basic.array;

public class SmallestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {8,5,9,1,6,1};
		int min=arr[0];
		for (int i=0;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Smallest Element ="+min);
	}

}
