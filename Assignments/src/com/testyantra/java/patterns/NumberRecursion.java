package com.testyantra.java.patterns;


public class NumberRecursion 
{ 
	static void printNos(int n) 
	{ 
		if(n > 0) 
		{ 
			System.out.println(n); 
			printNos(n - 1); 
			
		} 
	} 

	public static void main(String[] args) 
	{ 
		printNos(5); 
	} 
} 

