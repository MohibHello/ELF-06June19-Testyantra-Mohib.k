package com.testyantra.javaapp.constructor;

public class ConstInit {
	
	String name;
	int age;
	double percentage;
	
	public ConstInit(String n,int a,double per) 
	{
		name=n;
		age=a;
		percentage=per;
	}
	void display()
	{
		System.out.println("Name :- "+name);
		System.out.println("Age :- "+age);
		System.out.println("percentage :- "+percentage);
		
	}
	public static void main(String[] args) {
		
		ConstInit con=new ConstInit("amit", 45, 55.5);
		con.display();
		System.out.println("*************");
		ConstInit con2=new ConstInit("rahul", 33, 77);
		con2.display();
	}
}
