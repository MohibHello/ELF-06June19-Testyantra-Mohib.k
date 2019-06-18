package com.testyantra.javaapp.object.oriented;

public class BMIcalc 
{
	double weight;
	double height;


	public double bmiult()
	{
		double bmi=(weight/(height * height));	
		return bmi;
	}
	public void overalbmiresult(double bmi)
	{
		if(bmi>=30.0)
		{
			System.out.println(" Obese");
		}
		else if(bmi>=25)
		{
			System.out.println("overweight");
		}
		else if(bmi>=18.5)
		{
			System.out.println("normal");
		}
		else if(bmi>=16.5)
		{
			System.out.println("underweight");
		}
		else
		{
			System.out.println("severe underweight");
		}
	}
	public static void main(String[] args) {

		BMIcalc bm=new BMIcalc();
		bm.height=78;
		bm.weight=2.5;
		double bmi=bm.bmiult();
		System.out.println(bmi);
		bm.overalbmiresult(bmi);
	}


}
