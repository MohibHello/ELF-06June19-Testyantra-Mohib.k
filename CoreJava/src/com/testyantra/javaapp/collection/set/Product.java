package com.testyantra.javaapp.collection.set;

public class Product implements Comparable<Product> {

	public int id;
	public double cost;
	public double rating;

	@Override
	public int compareTo(Product o) {
		Double a = this.rating;
		Double b = o.rating;

		int k = a.compareTo(b) * -1;

		return k;

	}

}
