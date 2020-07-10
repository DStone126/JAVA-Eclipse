package com.syntax.class19;

public class AccessingEmployeeClassMembers {
public static void main(String[] args) {
	
	Employee emp = new Employee();
	emp.name = "Damo";
	emp.lastName = "Stoney";
	emp.age = 28;// accessing protected
	emp.salary = 100000;//accessing default
	//emp.ssn = 123562434; wont be available because it is private has to be within same class 
	emp.displayName();
	emp.displayAge();
	emp.displaySalary();
	//emp.displaySsn();  wont be available because it is private has to be within same class
}
}
