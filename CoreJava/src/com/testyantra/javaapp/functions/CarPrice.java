package com.testyantra.javaapp.functions;

public class CarPrice
{
public static void main(String[] args) 
{
int exshowroomprice=570000;
double rto=14.26;
double insurance=9.26;
int onroadprice=7_92_862;

double rto_ins=(exshowroomprice*rto)/100;

System.out.println("Ex-showroom Price (incl GST) :- "+exshowroomprice);
System.out.println("RTO :- "+rto_ins);
System.out.println("Insurance :- "+insurance);
System.out.println("On-Road Price :- "+onroadprice);
	
}
	
}
