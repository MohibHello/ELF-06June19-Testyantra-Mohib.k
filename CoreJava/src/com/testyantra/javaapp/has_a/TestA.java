package com.testyantra.javaapp.has_a;

public class TestA {

	public static void main(String[] args) {

		College.s.play();
		College.s.id = 45;
		log.info(""+College.s.id);
	}

}
