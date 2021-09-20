package com.basic.array;

public class EvenPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myArr[]=new int[] {1,2,3,4,5};
		System.out.println("Element given array present in even position");
		for(int i=1;i<myArr.length;i=i+2)
			System.out.print(" "+myArr[i]);
		//odd position
		System.out.println();
		for(int i=0;i<myArr.length;i=i+2)
			System.out.print(" "+myArr[i]);


	}

}
