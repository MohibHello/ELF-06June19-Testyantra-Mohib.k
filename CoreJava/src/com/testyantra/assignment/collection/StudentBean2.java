package com.testyantra.assignment.collection;

public class StudentBean2 {

	private int regno;
	private String name;
	private int marks;
	private char grade;

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
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

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "StudentBean [regno=" + regno + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}

}
