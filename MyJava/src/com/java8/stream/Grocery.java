package com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class Grocery {
	public static void main(String[] args) {
        //Inventory
        Product orange = new Product("Orange", new Price(2.99), new Weight(2.0));
        Product apple = new Product("Apple", new Price(1.99), new Weight(3.0));
        Product tomato = new Product("Tomato", new Price(3.49), new Weight(4.0));
        Product cucumber = new Product("Cucumber", new Price(2.29), new Weight(1.0));
        Product cheese = new Product("Cheese", new Price(9.99), new Weight(1.0));
        Product beef = new Product("Beef", new Price(7.99), new Weight(10.0));
        
        //Transactions
        List<Transaction> transactions = Arrays.asList(
                new Transaction(orange, 14),
                new Transaction(apple, 12),
                new Transaction(tomato, 5),
                new Transaction(cucumber, 15),
                new Transaction(cheese, 8),
                new Transaction(beef, 6)
        );
		/*
		 * Price totalPrice=transactions.stream() .map(Transaction::getTotalPrice)
		 * .reduce(Price.NIL,Price::add);
		 * System.out.printf("Total price of all transactions: %s\n", totalPrice);
		 */  
        
        //The total price of all the transactions is a result of summing the total price of all transactions
        Price totalPrice = transactions.stream()
                .map(Transaction::getTotalPrice)
                .reduce(Price.NIL, Price::add);
                
        	System.out.printf("Total price of all transactions: %s\n", 
        			totalPrice.toString());
        	
        	//Total Weight of All Sold Products
			/*
			 * Weight totalWeight = transactions.stream() .map(Transaction::getTotalWeight)
			 * .reduce(Weight.NIL, Weight::add);
			 * 
			 * System.out.printf("Total weight of all sold products: %s\n", totalWeight);
			 * System.out.printf("Total weight of all sold products: %s\n", totalWeight);
			 */
        	
        	transactions.stream()
            .map(Transaction::getTotalPrice).reduce(Price::getMax)
            .ifPresent(price -> System.out.printf("Highest transaction price: %s\n", price));
    }

}
