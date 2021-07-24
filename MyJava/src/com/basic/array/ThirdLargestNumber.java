package com.basic.array;

public class ThirdLargestNumber {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {3,1,9,4,6};
		System.out.println(" Third largest number  "+getThirdLargestNum(arr,arr.length));
			
		

	}

	private static int getThirdLargestNum(int[] arr, int length) {
		// TODO Auto-generated method stub
		int temp=0;
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[length-3];
	}

}
