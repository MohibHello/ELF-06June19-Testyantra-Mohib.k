package com.testyantra.javaapp.casting;
import lombok.extern.java.Log;

@Log
public class TestAc {

	public static void main(String[] args) {

		Animal a = new Cow();
		log.info(""+a.x);
		a.run();

		Cow c = (Cow) a;
		log.info(""+c.c);
		log.info(""+c.x);
		c.eat();
		c.run();
	}
}
