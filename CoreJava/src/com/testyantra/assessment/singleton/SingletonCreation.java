package com.tyss.assessment.singleton;

public class SingletonCreation {

	private static SingletonCreation ref = null;
	public static int count = 0;

	private SingletonCreation() {
		count++;
	}

	public static SingletonCreation getObject() {

		if (ref == null) {
			ref = new SingletonCreation();
		}
		return ref;
	}
}
