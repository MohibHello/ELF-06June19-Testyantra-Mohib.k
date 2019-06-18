package com.testyantra.javaapp.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestB {

	public static void main(String[] args) {

		FileInputStream fin = null;
		ObjectInputStream oin = null;
		try {

			fin = new FileInputStream("write.txt");
			oin = new ObjectInputStream(fin);
			Person p = (Person) oin.readObject();
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getSalary());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fin != null) {
				try {
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
