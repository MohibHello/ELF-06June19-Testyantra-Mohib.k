package com.testyantra.assignment.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileHandlingP3 {

	public static void main(String[] args) {

		Students s1 = new Students();
		s1.name = "amith";
		s1.percentage = 56.6;

		Students s2 = new Students();
		s2.name = "bheem";
		s2.percentage = 67.7;

		Students s3 = new Students();
		s2.name = "camella";
		s2.percentage = 87.4;

		Students s4 = new Students();
		s2.name = "ash";
		s2.percentage = 81.7;

		Students s5 = new Students();
		s2.name = "ziya";
		s2.percentage = 57.1;

		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		FileInputStream fin = null;
		ObjectInputStream oin = null;

		try {
			fout = new FileOutputStream("student.txt");
			oout = new ObjectOutputStream(fout);

			oout.writeObject(s1);
			oout.writeObject(s2);
			oout.writeObject(s3);
			oout.writeObject(s4);
			oout.writeObject(s5);

			System.out.println("object written");

			fin = new FileInputStream("student.txt");
			oin = new ObjectInputStream(fin);

			Students s = (Students) oin.readObject();
			System.out.println(s);
			Students ss = (Students) oin.readObject();
			System.out.println(ss);
			Students sss = (Students) oin.readObject();
			System.out.println(sss);
			Students sf = (Students) oin.readObject();
			Students sff = (Students) oin.readObject();

			System.out.println(s3);
			System.out.println(s4);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
