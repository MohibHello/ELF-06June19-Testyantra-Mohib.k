package com.testyantra.assignment.collection;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class StudentArrayList {

	public static void main(String[] args) {

		StudentBean2 sb1 = new StudentBean2();
		sb1.setRegno(1);
		sb1.setName("Mohib");
		sb1.setGrade('B');
		sb1.setMarks(60);

		StudentBean2 sb2 = new StudentBean2();
		sb2.setRegno(2);
		sb2.setName("Amith");
		sb2.setGrade('A');
		sb2.setMarks(90);

		StudentBean2 sb3 = new StudentBean2();
		sb3.setRegno(3);
		sb3.setName("Raj");
		sb3.setGrade('C');
		sb3.setMarks(45);

		StudentBean2 sb4 = new StudentBean2();
		sb4.setRegno(4);
		sb4.setName("john");
		sb4.setGrade('D');
		sb4.setMarks(50);

		StudentBean2 sb5 = new StudentBean2();
		sb5.setRegno(5);
		sb5.setName("mohan");
		sb5.setGrade('A');
		sb5.setMarks(90);

		ArrayList<StudentBean2> al = new ArrayList<>();
		al.add(sb1);
		al.add(sb2);
		al.add(sb3);
		al.add(sb4);
		al.add(sb5);

		for (StudentBean2 s : al) {
			log.info("Students detail :-" + s);
		}
	}
}
