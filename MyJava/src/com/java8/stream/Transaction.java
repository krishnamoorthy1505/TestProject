package com.java8.stream;

public class Transaction {
	private final int quantity;
	private final Product product;
	private Price price;

	/*
	 * public Transaction(int quantity, Product product) { super(); this.quantity =
	 * quantity; this.product = product; }
	 */
	public Transaction(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }    
	public Price getTotalPrice(){
		return this.product.getPrice().getTotal(quantity);
	}
	public Weight getTotalWeight() {
		return this.product.getWeight().getTotal(quantity);
	}
	
	
}
