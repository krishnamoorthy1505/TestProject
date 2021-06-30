package com.basic;

public class Polindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,n,sum=0,temp;
		n=454;
		temp=n;
		
		while(n>0){
			//System.out.println("n="+n);
			r=n%10;
			//System.out.println("r="+r);
			sum=(sum*10)+r;
			//System.out.println("sum="+sum);
			n=n/10;
			//System.out.println("n="+n);
		}
		if(temp==sum){
			System.out.println("Polindrome");
			
		}else{
			System.out.println("Is not a Polindrome");
		}

	}

}
