package com.testyantra.java.assessment.atm;

import lombok.extern.java.Log;

@Log
public class ATMMachine {

	void receive(BankCard b) {

		if (b instanceof HDFCBankCard) {
			log.info("HDFc Bank card");
		} else if (b instanceof ICICIBankCard) {
			log.info("ICICI Bank Card");
		}
	}
}
