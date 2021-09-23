/*
 * 42    - 1,2,3,6,7,14,21
 * 21 equals 3 times 7, 2 is omitted.
	14 equals 2 times 7, 3 is omitted.
	6 equals 2 times 3, 7 is omitted.
	42 itself.
	
	Hence, 42 is a sphenic number because it has exactly three prime factors 2, 3, and 7 and 
	the product of these factors gives the number itself.
	
	ex 2:
	 110  =1,2,5,10,11,15,22,55,110
	 110=110(2*5*10)
 */
package com.number;

import java.util.Arrays;
import java.util.Scanner;

public class SphenicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findPrime();
		Scanner keyIn=new Scanner(System.in);
		int n=keyIn.nextInt();
		int result=isSphenic(n);
		if(result == 1)  
			//prints yes if the above condition returns true  
			System.out.print("Yes, the given number is sphenic.");  
			else  
			//prints no if the above condition returns false  
			System.out.print("No, the given number is not a sphenic.");  

	}

	private static int isSphenic(int n) {
		// TODO Auto-generated method stub
		int arr1[]=new int[8];
		int count=0;
		int j=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0 && count<8) {
				count++;
				arr1[j++]=i;
			}
			
		}
		//checks that there is exactly 8 divisors or not and all the numbers are distincit prime or not  
		//if yes returns 1, else returns 0  
		if(count == 8 && (arr[arr1[1]] && arr[arr1[2]] && arr[arr1[3]]))  
		return 1;  
		return 0;  
	}
	//create a global array of size 100000  

	static boolean[] arr=new boolean[10000];
	//finds all the primes smaller than the limit  
	
	private static void findPrime() {
		// TODO Auto-generated method stub
		//marks all entries as true      
		//A value in mark[p] will finally be false if 'p' is Not a prime, else true.  

		Arrays.fill(arr, true);
		//iterate over all the numbers so that their multiples can be marked as composite  
		for(int p=2;p*p<10000;p++) {
			//if p is not changed, then it is a prime 
			if(arr[p]) {
				for(int i=p*2;i<10000;i=i+p) {
					arr[i]=false;
				}
			}

		}

	}

}
