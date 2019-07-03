package com.tyss.jdbc.common;

import lombok.extern.java.Log;

@Log
public class ClassA implements Connection {

	@Override
	public void m() {
		log.info("hello A here");
	}

}
