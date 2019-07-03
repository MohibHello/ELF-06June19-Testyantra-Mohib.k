package com.tyss.jdbc.common;

import lombok.extern.java.Log;

@Log
public class ClassB implements Connection {

	@Override
	public void m() {
		log.info("Hey its B");
	}

}
