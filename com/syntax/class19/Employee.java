package com.syntax.class19;

public class Employee {

public static String company;	//any class from any package in the project
public String name, lastName;	//any class from any package in the project
protected int age;	 //if class within same package it can access all default members
double salary; 		//default variable
private long ssn;	//only it is own class/ same can have an access private members

public static void displayCompany() {
	System.out.println("Employee works at "+ company);
}

public void displayName() {
	System.out.println("Employee name is "+ name + " "+ lastName);
}
protected void displayAge() {
	System.out.println("Employee is "+ age + " years old");
}
void displaySalary() {
	System.out.println("Employee salary is "+ salary);
}

private void displaySsn() {
	System.out.println("Employee ssn is "+ ssn);
}

public static void main(String[] args) {
	company = "Google";
	Employee emp = new Employee();
	emp.name = "Damien";
	emp.lastName = "Stone";
	emp.age = 28;
	emp.salary = 90000;
	emp.ssn = 123562434;
	
	emp.displayName();
	emp.displayAge();
	emp.displaySalary();
	emp.displaySsn();
	
	
	
}
}
