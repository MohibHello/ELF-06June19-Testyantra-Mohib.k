package com.testyantra.javaapp.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import lombok.extern.java.Log;

@Log
public class TestB {

	public static void main(String[] args) {

		FileInputStream fin = null;
		ObjectInputStream oin = null;
		try {

			fin = new FileInputStream("write.txt");
			oin = new ObjectInputStream(fin);
			Person p = (Person) oin.readObject();
			log.info("" + p.getId());
			log.info("" + p.getName());
			log.info("" + p.getSalary());

		} catch (FileNotFoundException e) {
			log.warning("this is FileNotFoundException" + e);
		} catch (IOException e) {
			log.warning("this is IOException" + e);
		} catch (ClassNotFoundException e) {
			log.warning("this is ClassNotFoundException" + e);
		} finally {
			if (fin != null) {
				try {
					fin.close();
				} catch (IOException e) {
					log.warning("this is IOException" + e);
				}
			}
			if (oin != null) {
				try {
					oin.close();
				} catch (IOException e) {
					log.warning("IOException3" + e);
				}
			}
		}

	}
}
