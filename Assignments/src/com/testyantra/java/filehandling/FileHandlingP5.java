package com.testyantra.java.filehandling;

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
			Object ob = oin.readObject();

			if (ob instanceof JavaBean) {
				System.out.println(((JavaBean) ob).getAge());
				System.out.println(((JavaBean) ob).getName());
				System.out.println(((JavaBean) ob).getDesignation());
				System.out.println(((JavaBean) ob).getSalary());
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
