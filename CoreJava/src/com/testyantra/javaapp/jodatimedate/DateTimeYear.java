package com.testyantra.javaapp.jodatimedate;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

import lombok.extern.java.Log;

@Log
public class DateTimeYear {

	public static void main(String[] args) {

		LocalDate l = LocalDate.now();
		log.info(" Current Date - " + l.getDayOfMonth());
		log.info("Current Year - " + l.getYear());
		log.info("current Month -" + l.getMonthValue());

		LocalDateTime now = LocalDateTime.now();
		Timestamp timestamp = Timestamp.valueOf(now);

		log.info("" + now); // 2019-06-14T15:50:36.068076300
		log.info("" + timestamp);

		LocalDateTime current = LocalDateTime.now();
		log.info("current date and time : " + current);

		LocalDate date22 = LocalDate.of(1997, 1, 11);
		log.info("my birthday date :" + date22);

		LocalDate date1 = LocalDate.now();

		LocalDate date2 = LocalDate.of(2014, Month.DECEMBER, 12);

		Period gap = Period.between(date2, date1);
		log.info("gap between dates " + "is a period of " + gap);

	}
}
