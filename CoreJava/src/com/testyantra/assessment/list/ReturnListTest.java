package com.testyantra.java.assessment.list;

import java.util.List;

import lombok.extern.java.Log;

@Log
public class ReturnListTest {

	public static void main(String[] args) {

		ReturnList List = new ReturnList();

		List l = List.receive(2);
		log.info("" + l.getClass());

	}
}
