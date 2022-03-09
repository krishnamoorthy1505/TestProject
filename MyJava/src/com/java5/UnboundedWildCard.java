package com.java5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnboundedWildCard {
	static void display(List<?> list){
		for(Object o:list)
			System.out.println(o);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al= Arrays.asList(1,2,3);
		display(al);
		List<String> str=Arrays.asList("one","two");
		display(str);

	}
}
