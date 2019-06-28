package com.testyantra.javaapp.collection.set;

public class Student implements Comparable<Student> {

	public String name;
	public int id;
	public double percentage;

	@Override
	public int compareTo(Student o) {

		String a = this.name;
		String b = o.name;
		int k = a.compareTo(b);
		return k;

	}

	/*
	 * Logic to sort student w.r.t id.
	 * 
	 * 
	 * @Override public int compareTo(Student o) {
	 * 
	 * if (this.id < o.id) { return -1; } else if (this.id > o.id) {
	 * 
	 * return 1; } else { return 0; } }
	 */

	/*
	 * @Override public int compareTo(Student o) { if (this.percentage <
	 * o.percentage) { return -1; } else if (this.percentage > o.percentage) {
	 * return 1; } else { return 0; } }
	 * 
	 * Logic to sort student w.r.t percentage.
	 */

}
