package com.tyss.jdbc.common;

public class MainMethodClass {

	public static void main(String[] args) {

//		ClassA classA = new ClassA();

		Connection ref = DriverManager.getConnection(args[0]);
		ref.m();
	}
}
