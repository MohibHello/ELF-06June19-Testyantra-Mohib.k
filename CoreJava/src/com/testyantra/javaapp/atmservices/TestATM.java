package com.testyantra.abstraction.javaapp.atmservices;

public class TestATM {
public static void main(String[] args) {
	
	Icici i=new Icici();
	HDFC h=new HDFC();
	ATM a=new ATM();
	SBI s=new SBI();
	
	a.val(i);
	System.out.println("***********hDfc customer**********");
	a.val(h);
	System.out.println("***********sbi customer**********");
	a.val(s);
}
}
