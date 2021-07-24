package com.basic.array;

public class Rotationleft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myArray[]=new int[] {1,2,3,4,5};
        //n determine the number of times an array should be rotated  

		int n=3;
		System.out.println("Orginal Arry");
		for(int i=0;i<myArray.length;i++)
		System.out.print(" "+myArray[i]);
        //Rotate the given array by n times toward left  

		for(int j=0;j<n;j++) {
			int first,k;
			//Store the first element array
			first=myArray[0];
			for(k=0;k<myArray.length-1;k++) {
				//shift element array by one
				myArray[k]=myArray[k+1];
			}
			//first element move to last element
			myArray[k]=first;
		}
		System.out.println("Reverse Array");
		for(int i=0;i<myArray.length;i++)
			System.out.print(" "+myArray[i]);
	}

}
