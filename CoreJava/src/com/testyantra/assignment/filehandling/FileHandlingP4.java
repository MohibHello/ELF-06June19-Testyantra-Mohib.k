package com.testyantra.assignment.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileHandlingP4 {

	public static void main(String[] args) {

		Employee j = new Employee();
		j.setAge(18);
		j.setName("java");
		j.setDesignation("developer");
		j.setSalary(200.0);

		FileOutputStream fout;
		try {
			fout = new FileOutputStream("file.csv");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(j);
			System.out.println("witten");
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
