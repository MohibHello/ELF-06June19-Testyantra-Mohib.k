package com.testyantra.java.assessment.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ReturnList {

	List receive(int num) {

		if (num == 1) {
			return new ArrayList<>();
		} else if (num == 2) {
			return new LinkedList<>();
		} else if (num == 3) {
			return new Vector<>();
		}
		return null;
	}
}
