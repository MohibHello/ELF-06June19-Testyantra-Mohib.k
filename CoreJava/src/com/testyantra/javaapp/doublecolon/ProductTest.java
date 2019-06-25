package com.testyantra.javaapp.doublecolon;

import lombok.extern.java.Log;

@Log
public class ProductTest {
	public static void main(String[] args) {

		MyProduct p = Product::new;

		Product pp = p.getProduct("dairymilk", 300);

		log.info("name " + pp.name);
		log.info("Cost " + pp.price);
		log.info("" + pp);
	}
}
