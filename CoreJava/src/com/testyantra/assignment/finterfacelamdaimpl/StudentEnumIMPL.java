package com.testyantra.java.finterfacelamdaimpl;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class StudentEnumIMPL {

	public static void main(String[] args) {

		Student s1 = new Student("mohib", 12, 42, 25.5, 'm');
		Student s2 = new Student("anita", 42, 55, 55.5, 'f');
		Student s3 = new Student("ankith", 36, 65, 65.5, 'm');
		Student s4 = new Student("monika", 25, 69, 67.5, 'f');
		Student s5 = new Student("harish", 22, 71, 75.5, 'm');

		ArrayList<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);

		for (Student s : al) {
			if (s.getGender() == 'm') {
				s.name = "Mr. " + s.name;
			} else {
				s.name = "Ms. " + s.name;
			}
		}

		al.stream().forEach(a -> log.info("" + a));
	}
}
