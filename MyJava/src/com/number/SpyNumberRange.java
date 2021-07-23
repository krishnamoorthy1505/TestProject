package com.number;

import java.util.Scanner;

public class SpyNumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lowRange=0,upperRange=0;
		Scanner input=new Scanner(System.in);
		lowRange=input.nextInt();
		upperRange=input.nextInt();
		for(int i=lowRange;i<upperRange;i++){
			if(isSpyNumber(i)){
				System.out.print(i+" ");
			}
		}

	}

	private static boolean isSpyNumber(int number) {
		// TODO Auto-generated method stub
		int sum=0,product=1,lastDigit=0;
		while(number!=0){
			lastDigit=number%10;
			sum=sum+lastDigit;
			product=product*lastDigit;
			number=number/10;
		}
		
		if(sum==product)
				return true;
				return false;
	}

}
