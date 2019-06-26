package com.testyantra.assignment.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import lombok.extern.java.Log;

@Log
public class FileHandlingP5 {

	public static void main(String[] args) {

		FileInputStream fin;
		try {
			fin = new FileInputStream("file.csv");
			ObjectInputStream oin = new ObjectInputStream(fin);
			Employee ob = (Employee) oin.readObject();

			if (ob instanceof Employee) {
				log.info("" + ((Employee) ob).getAge());
				log.info("" + ((Employee) ob).getName());
				log.info("" + ((Employee) ob).getDesignation());
				log.info("" + ((Employee) ob).getSalary());
			}

			log.info("readed");
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
