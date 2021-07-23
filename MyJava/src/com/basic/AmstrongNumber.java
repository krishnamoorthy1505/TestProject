/*1pow1 =1
153=1pow3+5pow3+3pow3=1+125+27=153
*/


package com.basic;
//Scanner package
import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number =");
		Scanner input=new Scanner(System.in);
		int inValue=input.nextInt();
		for(int i=0;i<=inValue;i++){
			if(isAmstrongNumber(i)){
				System.out.print(i+" ");
			}
		}

	}

	private static boolean isAmstrongNumber(int i) {
		// TODO Auto-generated method stub
		int temp=0,digit=0,sum=0,last=0;
		temp=i;
		while(temp>0){
			temp=temp/10;
			digit++;
			
		}
		temp=i;
		while(temp>0){
			//determine the last digit from the number
			last=temp%10;
			//calculates the power of a number up to digit times and add the resultant to the sum variable  
            sum+=Math.pow(last,digit);
            //Remove last digit
            temp=temp/10;
		}
		if(sum==i)
			return true;
		
		else return false;
	}

}
