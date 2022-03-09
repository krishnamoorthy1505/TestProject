package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestOrbitaryMethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(1,10,5,20,56,89);
		//Annonymus Inner Class
		Collections.sort(numbers, new Comparator<Integer>() {
			public int compare(Integer i1,Integer i2) {
				return i1.compareTo(i2);
			}
		});
		System.out.println("Annonymous");
		numbers.forEach(System.out::println);
		
		//Lambada Expression
		Collections.sort(numbers,(i1,i2)->i1.compareTo(i2));
		System.out.println("Lumbada Expression");
		numbers.forEach(System.out::println);
		//Method Reference
		Collections.sort(numbers,(Integer::compareTo));
		System.out.println("Method Reference");
		numbers.forEach(System.out::println);

		
	}
	

}
