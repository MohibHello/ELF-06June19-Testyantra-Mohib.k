package com.testyantra.javaapp.constructor;

public class Employee {

	String name;
	int id;
	double salary;
	
	
	
	public Employee(String name, int id, double salary) {

		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	void display()
	{
		System.out.println("Name := "+name);
		System.out.println("ID := "+id);
		System.out.println("Salary := "+salary);
	}

public static void main(String[] args) {
	
	Employee e=new Employee("Jagdesh", 505, 15000.0);
	e.display(); 
}

}
