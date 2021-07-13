
/*A number is called a tech number if the given number has an even number of digits 
and the number can be divided exactly into two parts from the middle. 
After equally dividing the number, sum up the numbers and find the square of the sum.
If we get the number itself as square, the given number is a tech number, 
else, not a tech number. For example, 3025 is a tech number.
2025= 20 | 25    20+25=45    45 *45 = 2025
*/
package com.number;

import java.util.Scanner;

public class TechNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,num,fh,sh,digit=0,sum=0;
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		num=n;
		while(num>0){
			//incerements the variable digits by 1      

			digit++;
			//removes the last digit of the given number  

			num=num/10;
		}
		System.out.println(digit);
		System.out.println(num);
		//check if the given number has an even number of digits or not  

		if(digit%2==0){
			num=n;
			//determines the first half of the given number  

			fh=(int) (num%(Math.pow(10,digit/2)));
			//determines the second half of the given number  

			sh=(int) (num/(Math.pow(10,digit/2)));
			System.out.println(fh);
			System.out.println(sh);
			//calculate the square of both the numbers  

			sum=(fh+sh)*(fh+sh);
			//compares the square of the sum with the given number  

			if(num==sum)
				System.out.println(num+" Tech Numbr "+sum);
			else
				System.out.println(num+" is not tech number "+sum);
			

		}
	}

}
