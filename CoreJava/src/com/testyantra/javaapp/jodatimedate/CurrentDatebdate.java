package com.testyantra.javaapp.jodatimedate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

import lombok.extern.java.Log;

@Log
public class CurrentDatebdate {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		LocalDateTime current = LocalDateTime.now();

		LocalDate date1 = LocalDate.now();

		LocalDate date2 = LocalDate.of(2000, Month.JANUARY, 11);
		LocalDate db = date2.plusYears(50);

		Period gap = Period.between(date2, db);

		log.info("gap between dates " + "is a period of " + gap);
	}
}
