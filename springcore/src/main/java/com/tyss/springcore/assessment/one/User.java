package com.tyss.springcore.assessment.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@Data
public class User {

	@Autowired
	private StorageDevice SDDevice;

	public void doSomthing() {

		SDDevice.format();
		SDDevice.read();
		SDDevice.write();

	}

}
