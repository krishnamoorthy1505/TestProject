package com.java5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GenericsMap {

	public static void main(String[] args) {
		// TODO Auto-geneIrated method stub
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(1, "A");
		m.put(2, "B");
		m.put(3, "C");
		System.out.println(m);
		Set<Entry<Integer, String>> s=m.entrySet();
		Iterator<Entry<Integer, String>> i=s.iterator();
		while(i.hasNext())
		{
			
			Map.Entry<Integer, String> out=i.next();
			System.out.println(out.getKey()+" "+out.getValue());
			//System.out.println(i);
			
		}
		

	}

}
