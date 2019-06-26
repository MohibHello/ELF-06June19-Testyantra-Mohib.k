package com.testyantra.assignment.objects;

import lombok.extern.java.Log;

@Log
public class Baby {

	void reveive(IceCream i) {
		if (i instanceof IceCream) {
			log.info("received icecream");
		}
	}

}
