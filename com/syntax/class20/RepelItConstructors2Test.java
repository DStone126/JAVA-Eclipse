package com.syntax.class20;

public class RepelItConstructors2Test {

	public static String make;
protected String model,color;
 private double price;
 int year,door,speed;

public void displayInfo() {
	System.out.println("We build " + year + " " + make + " " + model + " for price = $" + price);
}

RepelItConstructors2Test(){
	System.out.println("I am a consturctor");
}

public static void main(String[] args) {
	
	
	RepelItConstructors2Test car = new RepelItConstructors2Test();
	/*
	 Car-->class name
	 car-->reference variable
	 new-->keyword
	 Car();-->calling Constructor/constructor is a box of code that intialize the obj
	  */
	make = "BMW";
	car.model = "M5";
	car.year = 2021;
	car.color = "Pink";
	car.door = 4;
	car.speed = 200;
	car.price = 90000; 
	car.displayInfo();
	//System.out.println(car.model);
	
	//static String driver; local variables cannot be Static
	//System.out.println(driver);

	RepelItConstructors2Test car1 = new RepelItConstructors2Test();
	
	car1.model = "iS";
	car1.year = 2020;
	car1.color = "Blue";
	car1.door = 2;
	car1.speed = 200;
	car1.price = 100000; 
	car1.displayInfo();
}































}
