/**
 * Multiplying a number by two and three separately, the number obtained by writing
 *  the results obtained with the given number will be called a fascinating number. 
 *  If the result obtained after concatenation contains all digits from 1 to 9, exactly once.
*  327,327*1=327;327*2=654,327*3=981;
*  327+654+981=327654981(digits found0 0 to 9)
*  
 */
package com.number;

import java.util.Scanner;

public class FacinatingNumber {

	private static int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,num1,num2;
		int digit=0;
		String numString;
		boolean found=true;
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		int n=num;
		while(n>0){
			digit++;
			n=n/10;
			
		}
		System.out.println(digit);
		/**
		 * If the given number is a 3 or more than three-digit

		 */
		if (digit>=3){
			num1=num*2;
			num2=num*3;
		    numString=num+""+num1+num2;
			//checks all digits from 1 to 9 are present or not  
		    for(char c='1';c<='9';c++){
				//loop counts the frequency of each digit
				for(int i=0;i<numString.length();i++){
					//compares the character of concatstr with i  
					char ch =numString.charAt(i);
					if(ch==c)
						//incerments the count by 1 if the specified condition returns true  
						count++;
				}
				//returns true if any of the condition returns true  
				if(count>numString.length() || count==0){
						found=false;
						break;
					}
				
			}
			
		}
		else{
			System.out.println("the given number is a 3 or more than three-digit");
		}
		
		if(found)
			System.out.println(num+" Facinating number");
		else 
			System.out.println(num+" Is not a Facinating number");
	
		

	}

}
