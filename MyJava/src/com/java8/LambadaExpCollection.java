package com.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Product{
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class LambadaExpCollection {
	
	public static void main(String[] args) {
		List<Product> list=new ArrayList<>();
        list.add(new Product(1,"HP Laptop",25000f));  
        list.add(new Product(3,"Keyboard",300f));  
        list.add(new Product(2,"Dell Mouse",150f)); 
        Collections.sort(list,(p1,p2)->{
        	return p1.name.compareTo(p2.name);
        });
        System.out.println(list);
        for(Product p:list)
        	System.out.println(p.id+" "+p.name+" "+p.price);
        
        Stream<Product> pList=list.stream().filter(p->p.price>150);
        pList.forEach(p->{
        	System.out.println(p.name+" "+p.price);
        });

	}

}
