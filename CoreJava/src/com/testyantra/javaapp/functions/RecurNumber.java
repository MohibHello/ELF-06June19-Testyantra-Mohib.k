package com.testyantra.javaapp.functions;

public class RecurNumber 
{
public static void main(String[] args) {
	
	int a=recu(5);
	System.out.println(a);
}
public static int recu(int a)
{
	if(a==0)
	{
		return a++;
	}
	return recu(a-1);
}
}
