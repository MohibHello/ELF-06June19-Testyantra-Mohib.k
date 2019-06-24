package com.testyantra.javaapp.casting;
import lombok.extern.java.Log;

@Log
public class Testpm {

	public static void main(String[] args) {

		Pen p = new Marker();
		log.info(""+p.cost);

		p.write();

		Marker m = (Marker) p;
		log.info(""+m.cost);
		log.info(""+m.size);

		m.color();
		m.write();

	}
}
