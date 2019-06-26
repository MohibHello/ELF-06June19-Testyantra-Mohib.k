package com.testyantra.assignment.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import lombok.extern.java.Log;

@Log
public class FileHandlingP6 {

	public static void main(String[] args) {

		FileInputStream fin;
		try {
			fin = new FileInputStream("file.csv");
			ObjectInputStream oin = new ObjectInputStream(fin);
			Object ob = oin.readObject();

			Employee[] e1 = new Employee[1];
			e1[0] = (Employee) ob;

			for (Employee employee : e1) {

				log.info("" + employee.getName());
				log.info("" + employee.getDesignation());
				log.info("" + employee.getAge());
				log.info("" + employee.getSalary());

			}

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
