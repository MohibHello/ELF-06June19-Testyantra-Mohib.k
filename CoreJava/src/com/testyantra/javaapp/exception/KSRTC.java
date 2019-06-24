package com.testyantra.javaapp.exception;

import lombok.extern.java.Log;

@Log
class KSRTC {

	void ticket() {

		log.info("ticket generating");

		try {

			log.info("exception not occured" + (10 / 0));

			log.info("ticket generated sucessfully");
		} catch (ArithmeticException e) {
			log.info("exception occured");

		}

	}

}
