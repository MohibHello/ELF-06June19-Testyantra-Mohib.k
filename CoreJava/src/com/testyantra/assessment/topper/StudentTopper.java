package com.testyantra.assessment.java.topper;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class StudentTopper {

	public static void main(String[] args) {

		Predicate<Student> p = a -> {
			if (a.gender == 'f') {
				return true;
			}
			return false;

		};
		Predicate<Student> p2 = a -> {
			if (a.gender == 'm') {
				return true;
			}
			return false;

		};

		Comparator<Student> c = (a, b) -> {
			if (a.percentage > b.percentage) {
				return 1;
			} else if (a.percentage < b.percentage) {
				return -1;
			} else {
				return 0;
			}
		};

		ArrayList<Student> alist = new ArrayList<>();

		Student s1 = new Student("mohib", 12, 42, 25.5, 'm');
		Student s2 = new Student("anita", 42, 55, 55.5, 'f');
		Student s3 = new Student("ankith", 36, 65, 65.5, 'm');
		Student s4 = new Student("monika", 25, 69, 67.5, 'f');
		Student s5 = new Student("harish", 22, 71, 75.5, 'm');

		alist.add(s1);
		alist.add(s2);
		alist.add(s3);
		alist.add(s4);
		alist.add(s5);

		List<Student> lf = alist.stream().filter(p).collect(Collectors.toList());
		List<Student> lm = alist.stream().filter(p2).collect(Collectors.toList());

		Student femaleTopper = lf.stream().max(c).get();
		Student maleTopper = lm.stream().max(c).get();

		log.info("" + femaleTopper);
		log.info("" + maleTopper);

	}
}
