package com.syntax.class13;

public class Car {

	
	//define car features in the form of variables
	String make;
	String model;
	String color;
	int year;
	int speed;

	public static void main(String[] args) {
		System.out.println("Hello , i am code from main method");
		Car c1 = new Car();
		c1.make = "Honda";
		c1.model = "Accord";
		c1.color = "Gray";
		c1.year = 2019;
		c1.speed = 180;
	
		System.out.println("I have a " + c1.make + " and its a " + c1.model + " its " + c1.color +
				" i bought it in " + c1.year + " it can go " + c1.speed + " mph");
		
	c1.drive();
	c1.reverse();
	c1.stop();
	c1.transportPeople();
	
	
	
	}
	//define behavior in the from methods
	void drive() {
		System.out.println(make + " can drive");
		
	}	
	void reverse() {
		System.out.println(make + " can reverse");
	
	}
	void stop() {
		System.out.println(make + " can stop");
	}
	
	void transportPeople() {
		System.out.println( make + " can transport people");
	}

	
}
