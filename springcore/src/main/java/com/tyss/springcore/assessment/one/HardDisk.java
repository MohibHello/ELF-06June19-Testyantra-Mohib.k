package com.tyss.springcore.assessment.one;

import lombok.extern.java.Log;

@Log
public class HardDisk implements StorageDevice {

	String capacity = "1TB";
	String writingSpeed = "30mbps";
	String readingSpeed = "30mbps";

	@Override
	public void write() {
		log.info("writing to disk");
	}

	@Override
	public void read() {
		log.info("reading from disk");
	}

	@Override
	public void format() {
		log.info("formatting Harddisk");
	}

}
