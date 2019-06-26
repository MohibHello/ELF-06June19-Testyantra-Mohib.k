package com.testyantra.javaapp.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Loan {

	HOME(240), PERSONAL(241), CAR(250);

	private int value;

}
