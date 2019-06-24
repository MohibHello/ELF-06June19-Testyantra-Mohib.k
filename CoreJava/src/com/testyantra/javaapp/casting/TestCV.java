package com.testyantra.javaapp.casting;
import lombok.extern.java.Log;

@Log
public class TestCV {

	public static void main(String[] args) {

		Bus b = new Van();
		b.move();
		log.info(""+b.model);

		Van v = (Van) b;
		log.info(""+v.model);
		log.info(""+v.seat);
		v.turn();
		v.move();

	}
}
