package com.testyantra.assignment.streamandproperties;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Employee {

	private String name;
	private int id;
	private int age;
	private String designation;
	private double salary;

}
