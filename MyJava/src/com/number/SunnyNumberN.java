package com.number;

import java.util.Scanner;

public class SunnyNumberN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ln,un;
		Scanner input=new Scanner(System.in);
		ln=input.nextInt();
		System.out.println("Enter Upper range ");
		un=input.nextInt();
		System.out.println("Sunny number ln="+ln+" To un="+un);
		for(int i=ln;i<un;i++){
			if(isSunnyNumber(i))
				System.out.print(i+" ");
				
		}
		

	}

	private static boolean isSunnyNumber(int i) {
		// TODO Auto-generated method stub
		if(Math.sqrt(i+1)%1==0)
		return true;
		else 
			return false;
	}

}
