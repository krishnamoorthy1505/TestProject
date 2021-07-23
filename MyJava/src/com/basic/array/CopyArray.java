package com.basic.array;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[]{1,2,3,4,5};
		int[] copyArray=new int[array.length];
		for(int i=0;i<array.length;i++){
			copyArray[i]=array[i];
		}
		System.out.println("Orginal array");

		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println("copy array");

		for(int i=0;i<copyArray.length;i++){
			System.out.print(copyArray[i]+" ");
		}

	}

}
