package com.java8.funinter;

import java.util.function.Function;

public class FunctionTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] country= {"India","Pakistan","China","Australia"};
		Function<String[],String> converter= (all)->{
			String name="";
			for(String n : all) {
				String result = n.substring(0, n.indexOf(" "));
				System.out.println(result);
				result = n.substring(n.indexOf(""))+ " "+result;
				System.out.println(result);
				name += result + "\n";
			}
			return name;
		};
		System.out.println(converter.apply(country));
	}

}
