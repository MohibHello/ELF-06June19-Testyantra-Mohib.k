package com.tyss.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tyss.springcore.beans.MessageBean;

@Configuration
public class MessageConfiguration {

	@Bean
	public MessageBean getMessageBean() {
		MessageBean bean = new MessageBean();
		bean.setMessage("Hello");
		return bean;
	}
}
