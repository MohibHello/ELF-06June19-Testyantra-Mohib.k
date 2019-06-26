package com.testyantra.javaapp.enums;

import lombok.extern.java.Log;

@Log
public class LoanTest {

	public static void main(String[] args) {

		Loan t = Loan.CAR;

		int consValue = t.getValue();

		log.info(" value of personal " + consValue);
	}
}
