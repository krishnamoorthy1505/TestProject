/*Autobiographical number, the sum of digits equals the number of digits. 
Remember that the sum of digits should not exceed 10.
*we want to check the number 21200 is an autobiographical number or not.

First, find the sum of its digits (2+1+2+0+0) i.e. 5, 
and counts the number of digits of the given number i.e. 5.
 We observe that both are equal. 
Hence, the number 21200 is an autobiographical number.
*
*
*/
package com.number;

import java.util.Scanner;

public class AutoBiographicalNunber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyInput=new Scanner(System.in);
		System.out.println("Enter the number \t");
		int number=keyInput.nextInt();
		number=Math.abs(number);
		
		int n=number;
		String value=String.valueOf(number);
		int digitarray[]=new int[value.length()];
		for(int i=digitarray.length-1;i>=0;i--){
			digitarray[i]=n%10;
			//System.out.print(+i+" "+digitarray[i]);
			n=n/10;
		}
		boolean flag=true;
		for(int i=0;i<digitarray.length;i++){
			int count=0;
			for(int j=0;j<digitarray.length;j++){
				if(i==digitarray[j])
					count++;
			}
				if(count!=digitarray[i]){
					flag=false;
					break;
				}
			
			
		}
		if(flag)
			System.out.println(number+" AutoBiogrphical number");
		else	System.out.println(number+" is not a AutoBiogrphical number");
		}

}
