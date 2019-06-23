package com.testyantra.assignment.patterns;

public class Pattern8 {

	public static void main(String[] args) {

		int n = 4;
		for (int rows = 0; rows < n; rows++) {

			for (int spaces = 0; spaces < n - 1 - rows; spaces++) {

				System.out.print(" ");
			}
			for (int stars = 0; 2 * rows >= stars; stars++) {
				if (stars == 0 || stars == 2 * rows)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		for (int rows = n-2; rows >= 0; rows--) {

			for (int spaces = 0; spaces < n - 1 - rows; spaces++) {

				System.out.print(" ");
			}
			for (int stars = 0; 2 * rows >= stars; stars++) {
				if (stars == 0 || stars == 2 * rows)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}

}
