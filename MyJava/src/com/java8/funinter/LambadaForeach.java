package com.java8.funinter;

import java.util.ArrayList;
import java.util.List;

public class LambadaForeach {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		List<String> listName=new ArrayList<String>();
		listName.add("A");
		listName.add(null);
		listName.add("B");
		listName.forEach(n->System.out.println(n));

	}
}
