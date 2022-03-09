package com.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class FunctionBiConsumer {
	void showDetail(String name,int age) {
		System.out.println(name + " "+age);
	}
	static void mapDetail(Map<Integer, String> map,String name) {
		System.out.println("-----"+name+"------");
		System.out.println();
		map.forEach((k,v)->System.out.println(k+" "+v));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Method Reference
		BiConsumer<String, Integer> bc=new FunctionBiConsumer()::showDetail;
		bc.accept("gopi", 25);
		bc.accept("krishna", 30);
		
		//lambada Expression
		BiConsumer<String, Integer> bc1=(name,age)->{
			System.out.println(name + " "+age);
		};
		bc1.accept("Raja", 35);
		
		//map details
		Map<Integer, String> map=new HashMap<Integer,String>();
		map.put(1, "A");
		map.put(2,"B");
		map.put(3, "C");
		BiConsumer<Map<Integer,String>,String> bc2= FunctionBiConsumer::mapDetail;
		bc2.accept(map, "Alphabet");
	

	}

}
