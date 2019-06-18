package com.testyantra.javaapp.functions;

public class EvenNumberDivisiblebyFive {
	public static void main(String[] args) {

		for (int i = 50; i <=100; i++)
		{
			if(i%5==0)
			{
				if(i%2==0)
				{
					System.out.println(i);
				}
			}
		}
	}
}
