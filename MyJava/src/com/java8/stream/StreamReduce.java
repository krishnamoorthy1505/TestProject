package com.java8.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr= {10,20,30};
		IntStream stream=Arrays.stream(intArr);
		/*
		 * int result=stream.reduce(0, (a,b)->a+b); System.out.println(result);
		 */
		int sum=stream.reduce(0,Integer::sum);
		System.out.println(sum);
		/*
		 * OptionalInt oi=stream.max(); System.out.println(oi.getAsInt());
		 */
		List<String> nameList=List.of("java","DotNet","AWS");
		Optional length=nameList.stream().reduce((s1,s2)->(s1.length()>s2.length()?s1:s2));
		length.ifPresent(System.out::println);
	}

}
