package com.testyantra.java.finterfacelamdaimpl;

public enum Gender {

	MALE('m'), FEMALE('f'), OTHER('o');
	char val;

	private Gender(char val) {
		this.val = val;
	}

	public char getGender() {
		return val;
	}
}
