/*A neon number is a number where the sum of digits of the 
square of the number is equal to the number.
The task is to check and print neon numbers in a range.
square of 9
ex =9 * 9 =81(8+1=9)
8+1=9(Neon number)
*/

package com.number;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		if(checkNeon(n)){
			System.out.println("Given Number is ="+n+"Neon number");
		}else{
			System.out.println("Given number is "+n+"not a neon number");
			
		}
	}

	private static boolean checkNeon(int n) {
		// TODO Auto-generated method stub
		int sum=0;
		int square=n*n;
		
		while(square>0){
			
			int r=square%10;
			
			sum+=r;
			
			square=square/10;
			
		}
		
		
		if(sum==n)
			return true;
			return false;
	}

}
