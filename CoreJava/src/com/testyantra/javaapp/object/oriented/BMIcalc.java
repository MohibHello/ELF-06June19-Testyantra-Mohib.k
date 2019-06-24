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
			log.info(" Obese");
		}
		else if(bmi>=25)
		{
			log.info("overweight");
		}
		else if(bmi>=18.5)
		{
			log.info("normal");
		}
		else if(bmi>=16.5)
		{
			log.info("underweight");
		}
		else
		{
			log.info("severe underweight");
		}
	}
	public static void main(String[] args) {

		BMIcalc bm=new BMIcalc();
		bm.height=78;
		bm.weight=2.5;
		double bmi=bm.bmiult();
		log.info(bmi);
		bm.overalbmiresult(bmi);
	}


}
