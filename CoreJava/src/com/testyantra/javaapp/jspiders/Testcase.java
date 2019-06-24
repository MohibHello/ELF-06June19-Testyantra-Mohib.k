package com.testyantra.javaapp.jspiders;
import lombok.extern.java.Log;

@Log
public class Testcase {

	public static void main(String[] args) {
		
		Jspideratt j=new Jspideratt();
		Jspideratt a=new Jspideratt();
		
		j.swipe();
		a.swipe();
		a.swipe();
		j.swipe();                                               
		j.swipe();
		
		log.info("the no. of student present is java Class :- "+j.count);
		log.info("the no. of student present in angular class :- "+a.count);
		
		log.info("Number of Student present in Organization is "+Jspideratt.orgcount);
	}
}
