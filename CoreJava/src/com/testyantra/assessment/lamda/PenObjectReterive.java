package com.tyss.assessment.lamda;

import java.util.function.Supplier;

public class PenObjectReterive {

	public static void main(String[] args) {

		Supplier<Pen> supply = () -> {

			Pen p = new Pen();
			return p;
		};
		Pen pen = supply.get();
		pen.m();

	}
}
