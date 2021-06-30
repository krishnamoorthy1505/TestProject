package com.basic;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPrime(1);
		checkPrime(3);
		checkPrime(5);
		checkPrime(7);
		checkPrime(8);

	}

	private static void checkPrime(int n) {
		// TODO Auto-generated method stub
		int i,m,flag=0;
		m=n/2;
		if(n==0||n==1){
			System.out.println(n+" is not a prime number");
		}else{
			for(i=2;i<=m;i++){
				if(n%i==0){
					System.out.println(n+" is not a prime number");
					flag=1;
					break;
				}
				
			}
			if(flag==0){
				System.out.println(n+" is prime number");
			}
		}
		
		
	}

}
