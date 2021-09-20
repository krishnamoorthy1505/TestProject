package com.basic.string;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="simple java program".toLowerCase();
		int vcount=0,CCount=0;
		//name=name.toLowerCase();
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a'||name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u')
				vcount++;
			else
				if(name.charAt(i)>='a' && name.charAt(i)<='z' )
					CCount++;
		}
		System.out.println("Vowels Count "+vcount);
		System.out.println("Consonants Count "+CCount);

	}

}
