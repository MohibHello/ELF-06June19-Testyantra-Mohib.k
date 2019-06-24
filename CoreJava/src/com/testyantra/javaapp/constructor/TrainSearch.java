package com.testyantra.javaapp.constructor;

import lombok.extern.java.Log;

@Log
public class TrainSearch {

	void search(int id) {
		log.info("searching via Train Id" + id);
	}

	void search(String name) {
		log.info("searching train via name" + name);
	}

	void search(int id, String name) {
		log.info("searching via id and name" + id + "" + name);
	}

	public static void main(String[] args) {

		TrainSearch t = new TrainSearch();
		t.search(101);
		t.search("tumkur");
		t.search(102, "hello");
	}

}
