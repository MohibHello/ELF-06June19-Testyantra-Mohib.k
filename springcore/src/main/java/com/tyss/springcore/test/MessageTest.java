package com.tyss.springcore.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.springcore.beans.MessageBean;
import com.tyss.springcore.configuration.MessageConfiguration;

import lombok.extern.java.Log;

@Log
public class MessageTest {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfiguration.class);

		MessageBean messageBean = context.getBean(MessageBean.class);

		log.info(messageBean.getMessage());
	}
}
