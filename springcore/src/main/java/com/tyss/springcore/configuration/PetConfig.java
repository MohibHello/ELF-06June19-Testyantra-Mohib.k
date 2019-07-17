package com.tyss.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tyss.springcore.beans.PetBean;
import com.tyss.springcore.program.Animal;
import com.tyss.springcore.program.Donkey;
import com.tyss.springcore.program.Monkey;

@Configuration
public class PetConfig {

	// @Bean(name = "donkey")
	public Animal getAnimal() {

		Donkey donkey = new Donkey();
		return donkey;
	}

	// @Bean(name = "monkey")
	public Animal getAnimal2() {
		Monkey monkey = new Monkey();
		return monkey;
	}

	@Bean
	public PetBean getPet() {
		return new PetBean();
	}

}
