package com.testyantra.assignment.filehandling;

import java.io.Serializable;

import lombok.Data;

@Data
public class Employee implements Serializable {

	String Name;
	int age;
	String designation;
	double salary;

}
