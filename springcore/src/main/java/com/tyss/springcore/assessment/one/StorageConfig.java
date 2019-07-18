package com.tyss.springcore.assessment.one;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StorageConfig {

	@Bean
	public User getUser() {

		return new User();
	}

	@Bean
	public StorageDevice getDevice() {

		return new HardDisk();
	}
}
