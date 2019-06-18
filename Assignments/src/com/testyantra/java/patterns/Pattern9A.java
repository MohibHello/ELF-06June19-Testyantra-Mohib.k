package com.testyantra.java.patterns;

public class Pattern9A {

	public static void main(String[] args) {
		
		int n=3;
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				if(i==n/2 || j==n/2)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
