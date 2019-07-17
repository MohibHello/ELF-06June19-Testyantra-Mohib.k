package com.tyss.springcore.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.beans.PetBean;

public class AnimalTest {

	public static void main(String[] args) {

		/*
		 * ApplicationContext context = new
		 * AnnotationConfigApplicationContext(PetConfig.class); PetBean pbean =
		 * context.getBean(PetBean.class);
		 * 
		 * pbean.doSomthing();
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("petConfig.xml");

		PetBean pbean = (PetBean) context.getBean("pet");

		pbean.doSomthing();
	}
}
