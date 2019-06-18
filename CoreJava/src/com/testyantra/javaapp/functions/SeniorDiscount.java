package com.testyantra.javaapp.functions;

public class SeniorDiscount
{
	public static void main(String[] args) {


		double price=100;
		boolean issenior=true;
		double discount=15.2;

		if(issenior==true)
		{
		price=price-(price*discount)/100;
		}
		System.out.println("price of ticket :- "+price);
	}
}
