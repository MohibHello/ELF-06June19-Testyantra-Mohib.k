package com.testyantra.javaapp.abstraction;

import lombok.extern.java.Log;

@Log
public class TestAb {
	public static void main(String[] args) {

		Google gm = new Gmail();
		Google gd = new Gdrive();
		Browser b = new Browser();
		b.open(gm);
		log.info("*********2nd Sceniro********");
		b.open(gd);
	}
}
