package com.tyss.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.java.Log;

@Log
public class CourseTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("PropertiesConf.xml");

		Course course = (Course) applicationContext.getBean("Course");

		log.info("Course ID : " + course.getCourseId());
		log.info("course Name : " + course.getCourseName());
		log.info("faculty : " + course.getFaculty());

	}
}
