package com.syntax.class18;

public class Employee {

	int empId;
double salary;
 
static String CEO = "Damien";

void displayEmp() {
	System.out.println("Emplyee id is " +empId+ " ");
}
public static void main(String[] args) {

System.out.println(Employee.CEO);
// accessing static variables within same class
System.out.println(CEO);

//access static method
sayHelloToCeo();
}
static void sayHelloToCeo() {
	System.out.println("Hi " +CEO);

}
}
