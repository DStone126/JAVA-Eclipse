package com.syntax.class28;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e = new Employee("Damien Stone","QA");
			e.setSalary(90000000);
		double salary = e.getSalary();
		System.out.println(salary);
		
		e.setAge(28);
		System.out.println(e.getAge());
		
		e.setId(120332);
		System.out.println(e.getId());
	
		e.ssn = 123456789;
		
	}
}


