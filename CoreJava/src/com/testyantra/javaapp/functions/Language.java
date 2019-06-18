package com.testyantra.javaapp.functions;

public class Language
{
	public static void main(String[] args) 
	{
		
		System.out.println("enter a Number to select a language");
		int num=5;

		switch(num)
		{
		case 1: System.out.println("Kannada Selected");
		break;
		case 2: System.out.println("English Selected");
		break;
		case 3: System.out.println("hindi Selected");
		break;
		case 4: System.out.println("tamil Selected");
		break;
		default : System.out.println("invalid Option");
		break;

		}

	}
}
