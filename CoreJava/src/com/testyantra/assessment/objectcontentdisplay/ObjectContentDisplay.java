package com.testyantra.java.assessment.objectcontentdisplay;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class ObjectContentDisplay {

	public static void main(String[] args) {

		StudentObject ob1 = new StudentObject(10, "mohib", 50);

		ArrayList<StudentObject> al = new ArrayList<>();
		al.add(ob1);

		al.stream().forEach(a -> log.info("" + a.toString()));
	}
}
