package com.syntax.class18;

public class InstanceVariables {

	String name = "Yuriy";// instance variable
	
	public static void main(String[] args) {
		
	String name = "Kristina";// local variable
	System.out.println(name);
	
	//we create an Object or we instanciate a class-->InstanceVariables
	InstanceVariables obj = new InstanceVariables();
	obj.name = "Jane";
	System.out.println(obj.name);// Jane
	
	//would like to chang value from Kristina to Castro
	name = "Castro";
	System.out.println("New value of local variable "+name);
	
	//would like to change Jane to Ed-->changing value of the instance variable
	obj.name = "Ed";
	System.out.println("New value of instance variable " + obj.name);
	
	System.out.println("Printing value of name using 2nd instance");
	InstanceVariables obj1 = new InstanceVariables();
	System.out.println(obj1.name);
	
	obj1.name = "Ana";
	System.out.println("New value of name of 2nd instance is " + obj1.name);
	}
}
