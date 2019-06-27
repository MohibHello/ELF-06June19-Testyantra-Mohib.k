package com.testyantra.javaapp.doublecolon;

import lombok.extern.java.Log;

@Log
public class PenLamda {

	public static void main(String[] args) {

		DemoPro p = (a) -> {
			log.info("written");

		};
		p.write(5);

		Pen p2 = new Pen();
		DemoPro dp = p2::write;
		dp.write(2);
	}
}
