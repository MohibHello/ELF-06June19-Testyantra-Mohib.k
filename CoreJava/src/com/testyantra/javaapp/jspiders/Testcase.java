package com.testyantra.javaapp.jspiders;

public class Testcase {

	public static void main(String[] args) {
		
		Jspideratt j=new Jspideratt();
		Jspideratt a=new Jspideratt();
		
		j.swipe();
		a.swipe();
		a.swipe();
		j.swipe();                                               
		j.swipe();
		
		System.out.println("the no. of student present is java Class :- "+j.count);
		System.out.println("the no. of student present in angular class :- "+a.count);
		
		System.out.println("Number of Student present in Organization is "+Jspideratt.orgcount);
	}
}
