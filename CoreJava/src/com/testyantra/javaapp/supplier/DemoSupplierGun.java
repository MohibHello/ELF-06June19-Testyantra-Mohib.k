package com.testyantra.javaapp.supplier;

import java.util.function.Supplier;

import lombok.extern.java.Log;

@Log
public class DemoSupplierGun {

	public static void main(String[] args) {

		Supplier<Gun> g = () -> new Gun(100);

		Gun gb = g.get();

		log.info("" + gb.bullet);
	}
}
