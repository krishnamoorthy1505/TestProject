package com.java8.stream;

public class Price {
	public static final Price NIL = new Price(0.0);
	private final double value;

	public Price(double value) {
		super();
		this.value = value;
	}

	public Price getTotal(int quantity) {
		// TODO Auto-generated method stub
		return new Price(value * quantity);
	}
	public Price add(Price otherPrice) {
		return new Price(value + otherPrice.getValue());
	}

	public double getValue() {
		return value;
	}
	@Override
	public String toString() {
	    return String.format("$%.2f", value);
	}
	public Price getMax(Price othervalue) {
		return new Price(Double.max(value, othervalue.getValue()));
	}
	public Price getMin(Price otherprice) {
		return new Price(Double.max(value,otherprice.getValue()));
	}
}