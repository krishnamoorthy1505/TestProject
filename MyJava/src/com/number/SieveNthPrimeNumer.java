package com.number;

import java.util.ArrayList;

public class SieveNthPrimeNumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findNthPrimeNumber();
		System.out.println(primeList);
		System.out.println("7th prime number is " + primeList.get(6));  

	}
    static int MAX_SIZE=20;
    static ArrayList<Integer> primeList=new ArrayList<Integer>();
	private static void findNthPrimeNumber() {
		// TODO Auto-generated method stub
		boolean isPrime[]=new boolean[MAX_SIZE];
		for(int i=0;i<MAX_SIZE;i++) 
			isPrime[i]=true;
			//System.out.println(isPrime[i]);
			for(int p=2;p*p<MAX_SIZE;p++) {
				// If IsPrime[p] is not changed,   
				// then it is a prime 
				if(isPrime[p]==true) {
					System.out.print("p="+p);
					for(int i=p*p;i<MAX_SIZE;i+=p) {
						//System.out.print(" i["+i+"]="+isPrime[i]);
						isPrime[i]=false;
						//System.out.print(isPrime[i]);
					}
				}

			}
			for (int p = 2; p < MAX_SIZE; p++)  
				if (isPrime[p] == true)   
				//adding prime number to the ArrayList  
				primeList.add(p);  
		}   


}


