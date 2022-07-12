
/*In fibonacci series, next number is the sum of previous two 
numbers 
for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. 
The first two numbers of fibonacci series are 0 and 1.
*/

package com.basic;

public class FibonacciEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fNum=0,sNum=1,n=10,i=0;
		int aNum=0;
		/*
		 * for(int i=2;i<n;++i) { System.out.println("i="+i); }
		 */
		System.out.print(fNum+" "+sNum);
		while(i<n) {
		   // System.out.print(" "+aNum);

		    aNum=fNum+sNum;
		    System.out.print(" "+aNum);
		    fNum=sNum;
		    sNum=aNum;
			i++;
		}
		


		
		/*
		 * do { System.out.println(); System.out.print(" "+aNum);
		 * 
		 * aNum=fNum+sNum; //System.out.print(" "+aNum); fNum=sNum; sNum=aNum; i++;
		 * 
		 * 
		 * }while(i<n);
		 */
	}

}
