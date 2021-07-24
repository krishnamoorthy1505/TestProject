package com.basic.string;

public class CountPunctuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String name="He said, 'The mailman loves you.' I heard it with my own ears.";
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==':' || name.charAt(i)==',' || name.charAt(i)==';'
				|| name.charAt(i)=='.' || name.charAt(i)=='?' || name.charAt(i)=='-'
				|| name.charAt(i)=='/' || name.charAt(i)==':' || name.charAt(i)=='\"' || name.charAt(i)== '\''){
				count++;
			}
		}
		System.out.println("Count the Punctutation ="+count);
	}

}
