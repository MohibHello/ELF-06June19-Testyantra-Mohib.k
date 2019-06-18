package com.testyantra.javaapp.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestA {

	public static void main(String[] args) {

		Person p = new Person();
		p.setId(101);
		p.setName("mohib");
		p.setSalary(11111.1);

		try {
			FileOutputStream fout = new FileOutputStream("write.txt");
			ObjectOutputStream obj = new ObjectOutputStream(fout);
			obj.writeObject(p);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
