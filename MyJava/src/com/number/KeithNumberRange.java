/*
 * Let's check range 2 to n digits kenith number
 *  
 * ex:
 * 3 digits number 100 to 999 to check the kenith number
 * Split the number 742 =  7,4,2 then add the digits 7+4+2=13 
 * add the result value next series in  7,4,2,13 we add the last 3 terms 4+2+13=19 ....
 * 7, 4, 2, 13, 19, 34, 66, 119, 219, 404     404+219+119=742
 * 742=742 keith number 
 * 
 * ex2:19  1+9=10, 1,9,10   10+9=19  19=19
 */

package com.number;

import java.lang.reflect.Array;
import java.util.Scanner;

public class KeithNumberRange {

	private static long lowerBound;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyIn=new Scanner(System.in);
		int value=keyIn.nextInt();
		//check if the length of the number greater then 2 or not
		if(value<2)
			System.out.println("The number must haaveatleast two digits");
		else
			//calculate lower bounds where the series start
			lowerBound=(long) Math.pow(10, value-1);
			//System.out.println("Lb="+lowerBound);
			//calculate upperbounds where the series end
			long upperBound=(long)Math.pow(10,value);
			//System.out.println("UB="+upperBound);
			//range value lower bound to upper bound
			for(long i=lowerBound;i<upperBound;i++){
				if(isKeithNumber(String.valueOf(i)))
					System.out.print(i+" ");
				
			}

	}

	private static boolean isKeithNumber(String name) {
		// TODO Auto-generated method stub
		//find the length of the name
		int numLength=name.length();
		//set the size of array
		long series[]=new long[numLength];
		for(int i=0;i<numLength;i++){
				series[i]=Long.valueOf(name.substring(i,i+1));
		}
		long nextTerm=0;
		long number=Long.valueOf(name);
		while(nextTerm<number){
			nextTerm=0;
			for(int i=0;i<numLength;i++){
				nextTerm=nextTerm+series[i];
				if(i<numLength-1){
					//shift series to the left      
					series[i]=series[i+1];
				}
				else{
					//add the new value series
					series[i]=nextTerm;
				}
			}
		}
		if(nextTerm==number)
			return true;
		else
			return false;
			
	}

}
