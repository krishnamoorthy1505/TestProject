package com.number;

import java.util.ArrayList;
import java.util.Scanner;

public class AlternativePrimeNumberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int status=1;
		int num=3;
		Scanner input=new Scanner(System.in);
		ArrayList<Integer> primelist=new ArrayList<Integer>();
		n=input.nextInt();
		if(n>=1) {
			System.out.println("First"+n+"th Prime Number");
			System.out.println(2);
			primelist.add(2);
		}
		for(int i=2;i<=n;) {
			for(int j=2;j<=Math.sqrt(num);j++) {
				if(num%j==0) {
					status=0;
					break;
				}
			}
			if(status!=0) {
				System.out.println(num+"");
				primelist.add(num);
				i++;
			}
			status=1;
			num++;
		}
		System.out.println("Alternative Prime number");
		for(int i=0;i<primelist.size();i++) {
			if((i%2)==0) {
				System.out.println(primelist.get(i));
			}
				
		}
		
	}

}
