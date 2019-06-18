package com.testyantra.javaapp.javabean;

public final class Employee1 {

	private final boolean status;
	private final String name;
	private final int id;

	public Employee1(boolean status, String name, int id) {
		super();
		this.status = status;
		this.name = name;
		this.id = id;
	}

	public boolean isStatus() {
		return status;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

}
