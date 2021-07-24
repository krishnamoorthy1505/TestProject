/*
 * Let's check this number 742 kenith number
 * Find out the digit 3
 * Split the number 742 =  7,4,2 then add the digits 7+4+2=13 
 * add the result value next series in  7,4,2,13 we add the last 3 terms 4+2+13=19 ....
 * 7, 4, 2, 13, 19, 34, 66, 119, 219, 404     404+219+119=742
 * 742=742 keith number 
 * 
 * ex2:19  1+9=10, 1,9,10   10+9=19  19=19
 */
package com.number;

import java.util.ArrayList;
import java.util.Collections;

public class KeithNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		if(isKeith(19))
			System.out.println("Keith number");
		else
			System.out.println("Is not keith number");
		

	}

	private static boolean isKeith(int n) {
		// TODO Auto-generated method stub
		int temp=n;
		int count=0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		while(temp>0){
			//add the last digit in arraylist
			list.add(temp%10);
			//remove last digit
			temp=temp/10;
			
			count++;
		}
		//reverse order in collection
		Collections.reverse(list);
		int nextValue=0,i=count;
		while(nextValue<n){
			nextValue=0;
			//next term is the sum of previous n terms (it depends on number of digits the number has)
			
			for (int j=1;j<=count;j++){ 
				System.out.print(list.get(i-j));
				nextValue=nextValue+list.get(i-j);
			}	
				list.add(nextValue);
				i++;
				System.out.print(i+" ");
			
			
		}
		System.out.println(list);
			return nextValue==n;
		
		
	}

}

