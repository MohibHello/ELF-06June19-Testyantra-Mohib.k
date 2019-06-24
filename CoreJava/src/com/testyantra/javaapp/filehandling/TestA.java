package com.testyantra.javaapp.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import lombok.extern.java.Log;

@Log
public class TestA {

	public static void main(String[] args) {

		Person p = new Person();
		p.setId(101);
		p.setName("mohib");
		p.setSalary(11111.1);
		FileOutputStream fout = null;
		ObjectOutputStream obj = null;
		try {
			fout = new FileOutputStream("write.txt");
			obj = new ObjectOutputStream(fout);
			obj.writeObject(p);
		} catch (FileNotFoundException e) {
			log.warning("FileNotFoundException" + e);

		} catch (IOException e) {
			log.warning("IOException1" + e);
		} finally {
			if (fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					log.warning("IOException2" + e);
				}
			}

			if (obj != null) {
				try {
					obj.close();
				} catch (IOException e) {
					log.warning("IOException3" + e);
				}
			}
		}

	}
}
