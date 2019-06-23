package com.testyantra.assignment.collection;

public class StudentsAL {

	private int rollno;
	private String name;
	private int marks;
	private char gender;

	public StudentsAL() {
	}

	public StudentsAL(int rollno, String name, int marks, char gender) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.gender = gender;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "StudentsAL [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", gender=" + gender + "]";
	}

}
