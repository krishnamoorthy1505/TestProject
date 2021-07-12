package com.number;

public class ReverseNumberF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=12345,reverse=0;
		for(;number!=0;number=number/10){
			int reminder=number%10;
			reverse=reverse*10+reminder;
			/*
			 * for(;number != 0;){  
					int reminder = number % 10;  
					reverse = reverse * 10 + reminder;  
					number=number/10;  
			}  
			*/
			
		}
		System.out.println("Reverse Number ="+reverse);
	}

}
