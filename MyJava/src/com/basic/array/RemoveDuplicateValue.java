package com.basic.array;

public class RemoveDuplicateValue {
	public static void main(String[] args) {
		int arr[]= {1,1,2,4,3,3};
		int len=arr.length;
		int j=removeDuplicteArray(arr,len);
		System.out.println(j);
		for(int i=0;i<j;i++)
			System.out.print(arr[i]+" ");
		
	}

	private static int removeDuplicteArray(int[] arr, int len) {
		// TODO Auto-generated method stub
		int [] temp=new int[len];
		int j=0;
		if(len==0||len==1)
			return len;
		for(int i=0;i<len-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
		}//size off remove element
		temp[j++]=arr[len-1];
			for(int i=0;i<j;i++)
		{
			arr[i]=temp[i];
		}
		return j;
	}

}
