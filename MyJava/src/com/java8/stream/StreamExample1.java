package com.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* class Product {
	int id;  
    String name;  
    float price;
	public Product(int i, String string, float f) {
		// TODO Auto-generated constructor stub
		 this.id = id;  
	     this.name = name;  
	     this.price = price;  
	}
}*/
public class StreamExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        List<Float> productPriceList2 =productsList.stream()  
                                     .filter(p -> p.price > 30000)// filtering data  
                                     .map(p->p.price)        // fetching price  
                                     .collect(Collectors.toList()); // collecting as list  
        System.out.println(productPriceList2);  
        
        productsList.stream()
        				 .filter(p->p.price == 30000)
        				 .forEach(p->System.out.println(p.name));
		/*
		 * Stream.iterate(1, n->n+1) .limit(5) .forEach(System.out::println);
		 * Stream.iterate(0, n->n+1) .filter(m->m%2!=0) .limit(10)
		 * .forEach(n->System.out.println(n));
		 */
        

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> twoEvenSquares = numbers.stream().filter(
        		n -> {
            System.out.println("filtering " + n);
            return n % 2 == 0;
        }).map(n -> {
            System.out.println("mapping " + n);
            return n * n;
        }).limit(2).collect(Collectors.toList());
        
       


        for(Integer i : twoEvenSquares)
        {
            System.out.println(i);
        }
        
        List<Integer> numberss = Arrays.asList(2,3,4,5);
        int even =
        	       numberss.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
        	  
        	    System.out.println("Even="+even);

	}

}
