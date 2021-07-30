package com.basic.string;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class RepeatedWords {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		//boolean line;
		// TODO Auto-generated method stub
		String line,word="";
		int count,maxCount = 0;
		ArrayList<String> words=new ArrayList<String>();
		FileReader fileReader=new FileReader("name.txt");
		BufferedReader reader=new BufferedReader(fileReader);
		while((line=reader.readLine())!=null) {
			String string[]=line.toLowerCase().split("([,.\\s]+)");
            //Adding all words generated in previous step into words    
			for(String s:string)
				words.add(s);
			//System.out.println(words);
			
		}
        //Determine the most repeated word in a file    
		for(int i=0;i<words.size();i++) {
			count=1;
            //Count each word in the file and store it in variable count    
			for(int j=i+1;j<words.size();j++) {
				if(words.get(i).equals(words.get(j))) {
					count++;
				}
			}
			//System.out.println(count);
			if(count>maxCount) {
				maxCount=count;
				word=words.get(i);
			}

		}
		System.out.println("Most Repeated words = "+word);
		reader.close();
	}

}
