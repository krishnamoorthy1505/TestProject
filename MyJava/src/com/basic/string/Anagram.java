/*Two Strings are called the anagram if they contain the same characters. 
However, the order or sequence of the characters can be different.

*/

package com.basic.string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Grab".toLowerCase();
		String str2="Brag".toLowerCase();
		int l1=str1.length();
		int l2=str2.length();
		if(l1!=l2)
			System.out.println("Given string nota anagram");
		else {
			char[] c1=str1.toCharArray();
			char[] c2=str2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(Arrays.equals(c1, c2)==true)
				System.out.println("Both the strings are anagram");
			else
				System.out.println("Both the strings are not anagram");
		}

	}

}
