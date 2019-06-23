package com.testyantra.assignment.collection;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class ProductArrayList {
	public static void main(String[] args) {

		ProductBean p1 = new ProductBean();
		p1.setId(101);
		p1.setType("mobile");
		p1.setQuality("first");
		p1.setPrice(20000);

		ProductBean p2 = new ProductBean();
		p2.setId(102);
		p2.setType("car");
		p2.setQuality("third");
		p2.setPrice(90000);

		ProductBean p3 = new ProductBean();
		p3.setId(103);
		p3.setType("radio");
		p3.setQuality("second");
		p3.setPrice(24000);

		ProductBean p4 = new ProductBean();
		p4.setId(104);
		p4.setType("Headphone");
		p4.setQuality("first");
		p4.setPrice(1000);

		ArrayList<ProductBean> al = new ArrayList<>();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);

		for (ProductBean p : al) {
			if (p.getPrice() < 2000) {
				log.info("price :-" + p);
			}
		}
	}
}
