package com.testyantra.javaapp.abstraction;

public class Person implements Animal,Human
{

	public void walk() {
		System.out.println("walking");
	}

	public void eat() 
	{
	System.out.println("eating");	
	}

}
