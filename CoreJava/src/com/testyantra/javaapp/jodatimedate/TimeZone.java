package com.testyantra.javaapp.jodatimedate;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import lombok.extern.java.Log;

@Log
public class TimeZone {

	public static void main(String[] args) {

		ZonedDateTime currentZone = ZonedDateTime.now();
		log.info("the current zone is " + currentZone.getZone());

		ZoneId tokyo = ZoneId.of("Asia/Tokyo");

		ZonedDateTime tokyoZone = ZonedDateTime.now(tokyo);

		log.info("tokyo time zone is " + tokyoZone);

	}
}
