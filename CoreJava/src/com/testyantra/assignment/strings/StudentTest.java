package com.testyantra.assignment.strings;

public class StudentTest {

	public static void main(String[] args) {

		StudentBean sb1 = new StudentBean();
		sb1.setRegno(1);
		sb1.setName("Mohib");
		sb1.setGrade('B');
		sb1.setMarks(60);

		StudentBean sb2 = new StudentBean();
		sb2.setRegno(2);
		sb2.setName("Amith");
		sb2.setGrade('A');
		sb2.setMarks(90);

		StudentBean sb3 = new StudentBean();
		sb3.setRegno(3);
		sb3.setName("Raj");
		sb3.setGrade('C');
		sb3.setMarks(45);

		StudentBean sb4 = new StudentBean();
		sb4.setRegno(4);
		sb4.setName("john");
		sb4.setGrade('D');
		sb4.setMarks(50);

		StudentBean[] sb = new StudentBean[4];
		sb[0] = sb1;
		sb[1] = sb2;
		sb[2] = sb3;
		sb[3] = sb4;

		for (int i = 0; i < sb.length; i++) {
			StudentBean s = sb[i];
			System.out.println("RegNo : " + s.getRegno());
			System.out.println("Name : " + s.getName());
			System.out.println("Grade : " + s.getGrade());
			System.out.println("Marks : " + s.getMarks());
		}
	}
}
