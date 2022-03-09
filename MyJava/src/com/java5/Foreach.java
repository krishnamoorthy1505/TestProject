
package com.java5;

public class Foreach {
	static int total;
	public static void sum(int a[]) {
		for(int i:a) {
			total+=total+i;
		}
		System.out.println("Total ="+total);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubn
		int arr[] = {10,20,30,40};
		for(int i : arr) {
			System.out.println("i= "+i);
		}
		Foreach.sum(arr);

	}

}
