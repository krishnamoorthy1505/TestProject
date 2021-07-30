package com.basic.string;

public class FindLargestSmallestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="", small=" ",large="";
		String lsString="Find Largest smallest string in java";
		String words[]=new String[lsString.length()];
		int length=0;
		lsString=lsString+" ";

		for(int i=0;i<lsString.length();i++) {
	        //Split the string into words    

			if(lsString.charAt(i)!=' ') {
				word=word+lsString.charAt(i);
				//System.out.print(word);
			}
			else {
	            //Add word to array words   
				words[length]=word;
				length++;
	            //Make word an empty string    
				word="";
			}
			
		}
	    //Initialize small and large with first word in the string    

		small=large=words[0];
		for(int k=0;k<length;k++) {
			
	        //If length of small is greater than any word present in the string    
	        //Store value of word into small 
			System.out.print(" "+words[k]);
			if(small.length()>words[k].length())
				small=words[k];
			if(large.length()<words[k].length())
				large=words[k];
		}
		System.out.println();
        System.out.println("Smallest String ="+small);
        System.out.println("Largest String ="+large);
	}

}
