package com.number;

import java.util.ArrayList;
import java.util.List;

import jdk.javadoc.internal.doclets.toolkit.taglets.SummaryTaglet;

public class SmithNumberList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int n=1;n<1000;n++)
		{
			List<Integer> factors=findPrimeFactors(n);
			if(factors.size()>1) {
				int sum=SumOfDigits(n);
				for(int f:factors)
					sum=sum-SumOfDigits(f);
					if(sum==0)
						System.out.print(" "+n);
			}
		}
	}

	private static int SumOfDigits(int n) {
		// TODO Auto-generated method stub
		int s=0;
		while(n>0) {
			s=s+(n%10);
			n=n/10;
		}
		return s;
	}

	private static List<Integer> findPrimeFactors(int n) {
		// TODO Auto-generated method stub
		List<Integer> results=new ArrayList<Integer>();
		for(int i=2;n%i==0;n=n/i) {
			results.add(i);
		}
		for(int i=3;i*i<=n;i=i+2) {
			while(n%i==0) {
				results.add(i);
				n=n/i;
			}
		}
		if(n!=1)
			results.add(n);
		return results;
	}

}
