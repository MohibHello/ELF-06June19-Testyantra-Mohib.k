package com.testyantra.assignment.patterns;

public class Pattern6 {

	public static void main(String[] args) {
		
		int n=4;
		for (int rows = 0; rows < n; rows++) {
			
			for (int spaces = 0; spaces < n-1-rows; spaces++) {
				
				System.out.print(" ");
			}
			for (int stars = 0; 2*rows>=stars; stars++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
