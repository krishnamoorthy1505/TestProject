package com.java5;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list =new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		//list.add(10);
		System.out.println(list.get(1));
		Iterator i=list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
