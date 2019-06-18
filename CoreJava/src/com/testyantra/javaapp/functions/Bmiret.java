package com.testyantra.javaapp.functions;

public class Bmiret 
{
	public static double bmi(double w,double h)
	{
		
		double bmi=(w/(h * h));
		System.out.println(bmi);
		return bmi;

	}
	public static void bmiResult(double res)
	{
		if(res>=30.0)
		{
			System.out.println(" Obese");
		}
		else if(res>=25)
		{
			System.out.println("overweight");
		}
		else if(res>=18.5)
		{
			System.out.println("normal");
		}
		else if(res>=16.5)
		{
			System.out.println("underweight");
		}
		else
		{
			System.out.println("severe underweight");
		}
		
	}

	public static void main(String[] args) 
	{
		double bimres=bmi(1.95, 6.5);
		bmiResult(bimres);
	}
}
