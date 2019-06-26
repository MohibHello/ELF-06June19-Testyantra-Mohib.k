package com.testyantra.assignment.filehandling;

import java.io.Serializable;

import lombok.Data;

@Data
public class Students implements Serializable {

	String name;
	double percentage;

}
