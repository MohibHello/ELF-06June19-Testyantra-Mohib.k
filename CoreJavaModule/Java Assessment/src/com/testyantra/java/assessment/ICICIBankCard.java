package com.testyantra.java.assessment;

import lombok.extern.java.Log;

@Log
public class ICICIBankCard implements BankCard {

	public void bankName() {
		log.info("ICICI Bank");
	}
}
