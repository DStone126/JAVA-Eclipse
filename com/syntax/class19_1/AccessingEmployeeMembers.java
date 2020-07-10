package com.syntax.class19_1;

import com.syntax.class19.Employee;

public class AccessingEmployeeMembers {

	public static void main(String[] args) {
	
	Employee emp = new Employee();
	emp.name = "Damien";
	emp.lastName = "Stone";
	//emp.age = 28;
	//emp.salary = 90000;
	//emp.ssn = 123562434;
	
	emp.displayName();
	//emp.displayAge();
	//emp.displaySalary()
}
}
