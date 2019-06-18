package com.testyantra.javaapp.constructor;

public class Const
{
	public Const() 
	{
		System.out.println("this a constructor");
	}
	public Const(int x)
	{
		System.out.println(x);
	}
	public Const(double s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) {
		
		new Const();
		new Const(5);
		new Const(5.5);
		
	}
}
