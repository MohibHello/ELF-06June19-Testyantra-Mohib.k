package com.testyantra.assignment.patterns;


public class Pattern3
{
public static void main(String[] args) 
{
	int n=5;
for(int i=0;i<n;i++)
{
		for(int j=0;j<=i;j++)
	{

		System.out.print("* ");

	}
	System.out.println();
}
for(int i=1;i<n;i++)
{
	for(int j=0;i+j<=n-1;j++)
{

	System.out.print("* ");

}
System.out.println();
}
	
	
}
	
}
