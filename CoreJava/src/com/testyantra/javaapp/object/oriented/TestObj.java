package com.testyantra.javaapp.object.oriented;

public class TestObj
{
	public static void main(String[] args) 
	{
		Car a=new Car();
		Board b=new Board();
		Laptop l=new Laptop();
		
		a.name="bmw";
		a.seats=4;
		a.wheels=4;
		
		System.out.println("Car Name :- "+a.name);
		System.out.println("No. of seats :- "+a.seats);
		System.out.println("No. of wheels :- "+a.wheels);
		a.run();

		b.color="white";
		b.height=5;
		b.weight=2.1;
		b.size=12;
		
		System.out.println("Board Color ="+b.color);
		System.out.println("Board height ="+b.height);
		System.out.println("board weight ="+b.weight);
		System.out.println("board size ="+b.size);
		
		b.write();
		
		l.brand="lenovo";
		l.processor="I7";
		l.ram=4;
		
		System.out.println("Laptop Brand ="+l.brand);
		System.out.println("Laptop procesor ="+l.processor);
		System.out.println("laptop Ram ="+l.ram+" gb");
		
		l.on();
		l.off();
		
	}

}
