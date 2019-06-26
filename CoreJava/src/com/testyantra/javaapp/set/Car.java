package com.testyantra.javaapp.collection.set;

public class Car implements Comparable<Car> {

	public String name;
	public String brand;
	public int cost;
	public double rating;

	@Override
	public int compareTo(Car o) {

		return (this.name).compareTo(o.name);

	}
}
