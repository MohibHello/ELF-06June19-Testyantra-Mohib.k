package com.testyantra.javaapp.functions;

public class Percent 
{
public static void main(String[] args) {
	
	double res=per(300,600);
	System.out.println(res);
}
public static double per(double a,double b) 
{
	double grade=((a/b)*100);
	return grade;
}
}
                                                                                                     