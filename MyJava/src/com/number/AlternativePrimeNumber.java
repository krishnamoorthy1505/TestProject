package com.number;

public class AlternativePrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=20;
		printAlternativePrimeNumber(num);
		

	}

	private static void printAlternativePrimeNumber(int n) {
		// TODO Auto-generated method stub
		//System.out.println("n="+n);
		//value of temp variable is odd, we do not print the prime number  
		// value of temp variable is even, we print the prime number  

		int temp=2;
		for(int num=2;num<=n-1;num++) {
			//check number prime or not
			//System.out.print(num);
			if(checkPrime(num)==1) {
				//System.out.println("check Prime");
				//print even prime number if temp is even
				if(temp%2==0) 
					System.out.print(" temp="+temp+" num"+num);
				
				temp++;

			}
		}
		
	}

	private static int checkPrime(int num) {
		// TODO Auto-generated method stub
		int i,flag=0;
		for(i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0)
		return 1;
		else 
		return 0;
	}

}
