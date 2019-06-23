package com.testyantra.assignment.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileHandlingP5 {

	public static void main(String[] args) {

		FileInputStream fin;
		try {
			fin = new FileInputStream("file.csv");
			ObjectInputStream oin = new ObjectInputStream(fin);
			Employee ob = (Employee) oin.readObject();

			if (ob instanceof Employee) {
				System.out.println(((Employee) ob).getAge());
				System.out.println(((Employee) ob).getName());
				System.out.println(((Employee) ob).getDesignation());
				System.out.println(((Employee) ob).getSalary());
			}

			System.out.println("readed");
			oin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
