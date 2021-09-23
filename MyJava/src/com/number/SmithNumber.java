/*Sum of digits of n = Sum of digits of prime factors of n (counted with multiplicity)
 * 85 Sum of digits = 8 + 5 = 13

Prime factors of 85 is: 5,17

Sum of digits of its prime factors = 5 + 1+ 7 = 13

Compare the sum of digits with the sum of digits of its prime factors i.e. 13=13. Both are equal. Hence, the given number (85) is a smith number.


*/
package com.number;

import java.util.Scanner;

public class SmithNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int a=sumOfDigits(num);
		System.out.println("sum of digits "+a);
		int b=findSumPrimeFactors(num);
		System.out.println("Find sum of digits="+a);
		System.out.println("Find sum of prime factors="+b);
		if(a==b) {
			System.out.println("Number is smith number");
		}
		else {
			System.out.println("Number is not a smith number");
		}
			

	}

	private static int findSumPrimeFactors(int num) {
		// TODO Auto-generated method stub
		int i=2,sum=0;
		while(num>1) {
			if(num%i==0) {
			sum=sum+sumOfDigits(i);
			num=num/i;
			}
			else {
				do {
					i++;
				}while(isPrime(i));
			}
		}
		return sum;
	}

	private static boolean isPrime(int i) {
		// TODO Auto-generated method stub
		System.out.print("i="+i+" ");
		boolean b=true;
		int d=2;

		while(d<Math.sqrt(i)) {
			if(i%d==0) {
				b=false;
			}
			
			d++;
		}
		return b;
	}

	private static int sumOfDigits(int num) {
		// TODO Auto-generated method stub
		int s=0;
		while(num>0) {
			s=s+num%10;
			num=num/10;
		}
		return s;
	}

}
