package com.testyantra.javaapp.abstraction;

public class TestAb {
public static void main(String[] args) {
	
	Google gm=new Gmail();
	Google gd=new Gdrive();      
	Browser b=new Browser();
	b.open(gm);
	System.out.println("*********2nd Sceniro********");
	b.open(gd);
}
}
