package com.syntax.class24;

public class Parent {

	private void hello() {//private method do not participate 
		System.out.println("Hello from parent class");
	}
class Child extends Parent{
	// creating own private method inside own child class
	private void hello() {
		System.out.println("Hello from child class");
	}

	public static void hi() {
	System.out.println("Hi frome the the child class");
}
}
}
