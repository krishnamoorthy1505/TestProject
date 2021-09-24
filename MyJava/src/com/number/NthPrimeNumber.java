package com.number;

import java.util.Scanner;

public class NthPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int num=1,count=0,i;
		while(count<n) {
			num=num+1;
			//System.out.println(count+"  num="+num);
			for(i=2;i<=num;i++) {
				if(num%i==0) {
					break;
				}
			}
			if(i==num) {
				//increments the count variable by 1 if the number is prime  
				count++;
			}

		}
		System.out.println(n+" N th Prime number "+num);
	}

}
