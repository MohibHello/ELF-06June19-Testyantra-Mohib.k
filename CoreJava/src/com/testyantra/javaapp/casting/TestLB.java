package com.testyantra.javaapp.casting;
import lombok.extern.java.Log;

@Log
public class TestLB {

	public static void main(String[] args) {

		Chips c = new Lays();
		c.open();

		Chips cc = new Bingo();
		cc.open();

		log.info("*********downcasting********");
		Lays l = (Lays) c;
		l.open();
		l.eat();

		Bingo b = (Bingo) cc;
		b.byteBingo();
		b.open();
	}
}
