/**
 * Multiplying a number by two and three separately, the number obtained by writing
 *  the results obtained with the given number will be called a fascinating number. 
 *  If the result obtained after concatenation contains all digits from 1 to 9, exactly once.
*  327,327*1=327;327*2=654,327*3=981;
*  327+654+981=327654981(digits found0 1 to 9)
*  
 */

package com.number;

import java.util.Scanner;

public class FacinatingNumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int fromValue=input.nextInt();
		int toValue=input.nextInt();
		System.out.println("The facinating number from "+fromValue+" to"+toValue);
		//loop executes until the given condition returns false  
		for(int i=fromValue;i<=toValue;i++){
			//calling user-defined number  
			if(isFacinatingNumber(i)){
				//prints all the fascinating numbers between a given range  
				System.out.print(i+" ");
			}
		}

	}

	private static boolean isFacinatingNumber(int i) {
		int digit=0;
		//declaring array
		//new number  
		String name=""+ i + i*2 + i*3;
		if(i==192)
			System.out.println(name);
		int digitArr[] = new int[10];
		//comparing array elements with characters of the string
		for(int j=0;j<name.length(); j++){
			//convert char to int
			digit=name.charAt(j)-'0';
			//check arr[digit] element and ignore 0s 
 			if(digit==0||digitArr[digit]==0){
				digitArr[digit]++;
			}
			else	return false;
		}
		//checks the numbers that are missing  
		for(int k=1;k<digitArr.length;k++){
			
			System.out.print(" "+digitArr[k]);

			if(digitArr[k]==0)
				return false;
		}
		
		return true;
	}
}
