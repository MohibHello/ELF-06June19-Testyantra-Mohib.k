package com.testyantra.assignment.collection;

public class ProductBean {

	private int id;
	private String type;
	private double price;
	private String quality;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	@Override
	public String toString() {
		return "ProductBean [id=" + id + ", type=" + type + ", price=" + price + ", quality=" + quality + "]";
	}

}
