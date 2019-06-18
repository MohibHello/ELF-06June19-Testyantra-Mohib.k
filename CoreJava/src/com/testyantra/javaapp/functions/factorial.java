package com.testyantra.javaapp.functions;

public class factorial 
{
public static int fact(int a)
{
	int f=1;
	for(int i=1;i<=a;i++)
	{
		f=f*i;
	}
	return f;
}
	public static void main(String[] args) {
		
		int fac=fact(5);
		
		System.out.println("the factorial of entered number is "+fac);
	}
}
