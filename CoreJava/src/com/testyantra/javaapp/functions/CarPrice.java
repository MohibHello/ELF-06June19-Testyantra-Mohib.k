package com.testyantra.javaapp.functions;

import lombok.extern.java.Log;

@Log
public class CarPrice {
	public static void main(String[] args) {
		int exshowroomprice = 570000;
		double rto = 14.26;
		double insurance = 9.26;
		int onroadprice = 7_92_862;

		double rtoins = (exshowroomprice * rto) / 100;

		log.info("Ex-showroom Price (incl GST) :- " + exshowroomprice);
		log.info("RTO :- " + rtoins);
		log.info("Insurance :- " + insurance);
		log.info("On-Road Price :- " + onroadprice);

	}

}
