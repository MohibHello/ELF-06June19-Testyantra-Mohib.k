package com.testyantra.javaapp.constructor;

public class Gift {
	void receive(Phone p) {
		if (p instanceof IPhone) {
			System.out.println("i love u");
		} else {
			System.out.println("thk u bro");
		}
	}
}