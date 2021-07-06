/*Leap Year contains 366 days, which comes once every four years. 
 * Every leap year corresponds to these facts : 

A century year is a year ending with 00.
A century year is a leap year only if it is divisible by 400.
A leap year (except a century year) can be identified if it is exactly divisible by 4.
A century year should be divisible by 4 and 100 both.
A non-century year should be divisible only by 4.
*/
package com.basic;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leapYear(2000);
		leapYear(2005);

	}

	private static void leapYear(int i) {
		// TODO Auto-generated method stub
		boolean isLeafYear=false;
		if(i%4==0){
			if(i%100==0){
				if(i%400==0){
					isLeafYear=true;
				}
				else{
					isLeafYear=false;
				}
			}
			isLeafYear=true;
		}
		else
			isLeafYear=false;
		if(!isLeafYear){
			System.out.println(i+" Non Leaf Year");
		}
		else{
			System.out.println(i+" Leaf Year");
		}
		
		
		
	}

}
