package com.testyantra.assignment.filehandling;

import java.io.Serializable;

public class Students implements Serializable {

	String name;
	double percentage;

	public String getName() {
		return name;
	}

	public double getPercentage() {
		return percentage;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", percentage=" + percentage + "]";
	}

}
