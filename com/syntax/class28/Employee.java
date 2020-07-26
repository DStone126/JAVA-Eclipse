package com.syntax.class28;

public class Employee {

	//make variables as private
	
	public String fullName, title;
	public int ssn;
	
	private double salary;
	private int age, empId;

	public Employee(String fullName,String title) {
		this.fullName = fullName;
		this.title = title;
	}
	
	
	// creat public methods (getters and setters)to give access private variables
	
	// creating getters
	
	public double getSalary() {
		return salary;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getId() {
		return empId;
}

	//creating setters
	
	public void setSalary(double salary) {
		this.salary = salary;
		
	}
	
	
	public void setAge(int age) {
		
		if(age > 16) {
		
		this.age = age;
		}
		
	}
	
	
	public void setId(int empId) {
		
		if(empId > 0) {
		
		this.empId = empId;
		}
	}
	
}