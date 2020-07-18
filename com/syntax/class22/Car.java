package com.syntax.class22;

public class Car {

	String make;
	
	
	public Car(String make) {
		//super();
		this.make = make;
		//System.out.println("i am non argument constructor");
	}

}
class Tesla extends Car{
	
	boolean autopilot;
	
	public Tesla(String make, boolean autopilot){
		super(make);
		this.autopilot = autopilot;
		//System.out.println("i am non argument constructor of child class");
	}
void info() {
	System.out.println("we build "+make+" that has autopilot feature = "+autopilot);
}
}