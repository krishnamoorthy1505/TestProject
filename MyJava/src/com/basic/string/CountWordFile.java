package com.basic.string;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWordFile {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int count=0;
		String line;
		FileReader reader=new FileReader("name.txt");
		BufferedReader bufferReader=new BufferedReader(reader);
		while((line=bufferReader.readLine())!= null){
			String words[]=line.split("");
			count=count+words.length;
		}
		System.out.println("Number of words present given in a file ="+count);
	}

}
