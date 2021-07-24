package com.basic.array;

public class DublicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,1,2,3,4,5};
		System.out.print("Orginal arry");
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					System.out.print(" "+arr[j]);
			}
		}

	}

}
