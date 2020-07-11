package com.syntax.class19_1;

import com.syntax.class19.Employee;
//to import ctrl+ shift+ o
public class AccessingEmployeeMembers {

	public static void main(String[] args) {
	
	Employee emp = new Employee();
	emp.name = "Damien";
	emp.lastName = "Stone";
	//emp.age = 28; -->protected not visible not in same package
	//emp.salary = 90000; -->default not visible not in same package
	//emp.ssn = 123562434; -->private not visible not in same class
	
	emp.displayName();
	//emp.displayAge();  -->protected not visible will work if in same package
	//emp.displaySalary() -->default not visible will work if in same package
	//emp.displaySsn(); -->private not visible its super protected
	}
}
