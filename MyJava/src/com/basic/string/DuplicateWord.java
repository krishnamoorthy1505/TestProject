package com.basic.string;

public class DuplicateWord {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dupWord="java string java count duplicate words string ";
		int count=0;
		String word[]=dupWord.split(" ");
		/*
		 * for(int i=0;i<word.length;i++) System.out.println(word[i]);
		 */	for(int i=0;i<word.length;i++) {
			count=1;
			
			for(int j=i+1;j<word.length;j++) {
				if(word[i].equals(word[j])) {
					count=count+1;
					word[j]="0";
				}
			}
			if(count>1 && word[i]!= " " && word[i] != "0")
				System.out.println(word[i] + " "+count);

		}
		

	}

}
