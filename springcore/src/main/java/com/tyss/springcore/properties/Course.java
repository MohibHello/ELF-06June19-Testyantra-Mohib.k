package com.tyss.springcore.properties;

import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@Data
public class Course {

	private int courseId;
	private String courseName;
	private String faculty;
}
