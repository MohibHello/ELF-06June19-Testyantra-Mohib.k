package com.testyantra.javaapp.inheritance;

public class TestCase 
{
	public static void main(String[] args) {

		/*
		 * ScientificCalc sc=new ScientificCalc(); sc.add(); sc.cos(); sc.sub();
		 * sc.sin();
		 * 
		 * Calculator c=new Calculator(); c.add(); c.sub();
		 * 
		 * LevelThree t3=new LevelThree(); t3.crawl(); t3.walk(); t3.run();
		 * 
		 * Son s=new Son(); s.height(); s.look(); s.newLook();
		 * 
		 * Daughter d=new Daughter(); d.differentlook(); d.height(); d.look();
		 */
//		LevelOne l1=new LevelOne();
//		LevelTwo l2=new LevelTwo();
//		LevelThree l3=new LevelThree();
//		
//		l1.speed();
//		l2.speed();
//		l3.speed();
		
		Animal a=new Cow();
		a.eating();
		a=new Lion();
		a.eating(); 
		a=new Animal();
		
	
	
		a.eating();
	}
}
