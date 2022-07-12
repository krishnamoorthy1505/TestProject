package com.java8.stream;

import java.util.List;

public class StreamReducerCombiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Our Mathematical Universe: My Quest for the Ultimate Nature of Reality";
		List<String> wordList=List.of(string.split("" ));
		int count=wordList.stream().reduce(0,(a,b)->a+b.length(),(parLength,otherParLength)->parLength+otherParLength);
		System.out.println(String.format("jkbhjhjkhk %d",count));
		
		

	}

}
