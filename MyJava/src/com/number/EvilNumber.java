/*The Evil number is another special positive whole number in Java 
that has an even number of 1's in its binary equivalent. 
The numbers which are not evil are called odious numbers. Let's some examples of evil and odious numbers.

15 is an evil number because in its binary equivalent, i.e., 1111, it has an even number of ones.
16 is an odious number because in its binary equivalent, i.e., 10000 has not even number of ones
23 is also an evil number because it has an even number of ones in its binary equivalent, i.e., 10111.

*/
package com.number;

import java.util.Scanner;

public class EvilNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		Scanner keyIn=new Scanner(System.in);
		num=keyIn.nextInt();
		if(checkNumber(num))
			System.out.println(num+" is Evil Number");
		else
			System.out.println(num+"is not a Evil Number");

	}

	private static boolean checkNumber(int num) {
		// TODO Auto-generated method stub
		long binaryNumber=convertToBinary(num);
		//System.out.println("binary number"+binaryNumber);
		int count=0;
		while(binaryNumber!=0) {
            // if the last digit of binary number is 1, increase the count value  
			if(binaryNumber%10==1)
				count++;
			binaryNumber=binaryNumber/10;
		}
		//System.out.println("count="+count);
		if(count%2==0)
			return true;
		return false;
	}

	private static long convertToBinary(int num) {
		// TODO Auto-generated method stub
		long binaryNumber=0;
		int rem=0;
		int j=1;
		while(num!=0) {
			rem=num%2;
			binaryNumber+=rem*j;
			num=num/2;
			j=j*10;
			//System.out.println("rem="+rem+" binary="+binaryNumber+" num="+num+" j="+j);
		}
		return binaryNumber;
	}

}
