package com.testyantra.assignment.collection;

public class UserCheck {

	void userChecking(String usr) throws InvalidUserCheckedException {
		if (usr == "root") {
			System.out.println("Valid User");
		} else {
			throw new InvalidUserCheckedException();
		}
	}

	public static void main(String[] args) {

		UserCheck uc = new UserCheck();
		String str = "root";
		try {
			uc.userChecking(str);
		} catch (InvalidUserCheckedException e) {
			e.getMessage();
		}

	}
}
