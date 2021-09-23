/*xylem number if the sum of its extreme (first and last) digits is equal to the sum of mean 
(all digits except first and last) digits. 
If the sum of extreme digits is not equal to the sum of mean digits, the number is called phloem number.
ex:34326
extreme 3+6=9
mean 4+3+2=9
9=9 xylem number  else extreme number
*/
package com.number;

import java.util.Scanner;

public class XylemPholoemNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,extreme_sum=0,mean_sum=0,num;
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		System.out.println(num);
		n=num;
		while(n !=0 ) {
			if(n==num || n<10 ) {
				extreme_sum=extreme_sum+n%10;
			}
			else {
				mean_sum=mean_sum+n%10;
			}
			n=n/10;
		}
					
					  System.out.println("Extreme sum="+extreme_sum);
					  System.out.println("Meansum="+mean_sum); 
					  if(extreme_sum==mean_sum)
					  System.out.println("Xylem number"); 
					  else System.out.println("pholoem number");
					 
	}

}
