/**
 * A number is called an automorphic number 
 * if and only if the square of the given number ends 
 * with the same number itself
 * 76=76*76=5776(last two digit)
 * 76=76 
 */
package com.number;

public class AutoMorphicNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAutomorphiv(76)?"AutomorphicNumber":"is not AutoMorphicNumber");
		System.out.println(isAutomorphiv(13)?"AutomorphicNumber":"is not AutoMorphicNumber");
		
	}

	private static boolean isAutomorphiv(int n) {
		// TODO Auto-generated method stub
		int square=n*n;
		while(n>0){
			if(square%10 != n%10)
			return false;
			n=n/10;
			square=square/10;
		
			}
			return true;
	}

}
