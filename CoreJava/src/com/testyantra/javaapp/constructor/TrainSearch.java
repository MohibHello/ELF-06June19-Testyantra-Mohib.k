package com.testyantra.javaapp.constructor;

public class TrainSearch {

	void search(int id)
	{
		System.out.println("searching via Train Id");
	}
	void search(String name)
	{
		System.out.println("searching train via name");
	}
	void search(int id,String name)
	{
		System.out.println("searching via id and name");
	}
	public static void main(String[] args) {
		
		TrainSearch t=new TrainSearch();
		t.search(101);
		t.search("tumkur");
		t.search(102, "hello");
	} 
	
}
