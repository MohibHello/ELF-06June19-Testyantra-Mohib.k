package com.testyantra.abstraction.javaapp.atmservices;
import lombok.extern.java.Log;

@Log
public class TestATM {
public static void main(String[] args) {
	
	Icici i=new Icici();
	HDFC h=new HDFC();
	ATM a=new ATM();
	SBI s=new SBI();
	
	a.val(i);
	log.info("***********hDfc customer**********");
	a.val(h);
	log.info("***********sbi customer**********");
	a.val(s);
}
}
