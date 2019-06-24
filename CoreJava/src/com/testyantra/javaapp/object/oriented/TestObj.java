package com.testyantra.javaapp.object.oriented;
import lombok.extern.java.Log;

@Log
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
		
		log.info("Car Name :- "+a.name);
		log.info("No. of seats :- "+a.seats);
		log.info("No. of wheels :- "+a.wheels);
		a.run();

		b.color="white";
		b.height=5;
		b.weight=2.1;
		b.size=12;
		
		log.info("Board Color ="+b.color);
		log.info("Board height ="+b.height);
		log.info("board weight ="+b.weight);
		log.info("board size ="+b.size);
		
		b.write();
		
		l.brand="lenovo";
		l.processor="I7";
		l.ram=4;
		
		log.info("Laptop Brand ="+l.brand);
		log.info("Laptop procesor ="+l.processor);
		log.info("laptop Ram ="+l.ram+" gb");
		
		l.on();
		l.off();
		
	}

}
