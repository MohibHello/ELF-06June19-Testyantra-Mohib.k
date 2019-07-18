package com.tyss.springcore.assessment.one;

import lombok.extern.java.Log;

@Log
public class PenDrive implements StorageDevice {

	String capacity = "32GB";
	String writingSpeed = "10mbps";
	String readingSpeed = "15mbps";

	@Override
	public void write() {
		log.info("writing to disk");
	}

	@Override
	public void read() {
		log.info("reading from pendrive");

	}

	@Override
	public void format() {
		log.info("formatting PenDrive");

	}

}
