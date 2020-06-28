package com.syntax.class13;

public class CarFactory {
public static void main(String[] args) {
	// Syntazx of variables
	//data type name = value
	//int       num = 10
	//Car 	car1 = new Car();
	
	
		
	// building object of the car
	Car	car1 = new Car();
		car1.make = "Tesla";
		car1.model = "X";
		car1.color = "Red";
		car1.year = 2020;
		car1.speed = 200;

	System.out.println("Make of first car is "
	+ car1.make + " and model is " + car1.model +
	" it is in " + car1.color + " color ");
	
	System.out.println("---Accessing methods frome Car class using car1-----");
	car1.drive();
	car1.reverse();
	car1.transportPeople();
	
	//creating new objects
	Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "M5";
		car2.color = "Blue";
		car2.year = 2018;
		car2.speed = 240;
	
	System.out.println("Make of second car is " + car2.make);
	car2.drive();
	car2.reverse();
	car2.transportPeople();
		
	
	
	Car car3 = new Car();
		car3.make = "Dodge";
		car3.model = "Viper";
		car3.color = "Black";
		car3.year = 2010;
		car3.speed = 300;

	System.out.println("Make of my favorite car is "
				+ car3.make + " and model is " + car3.model +
				" it is in " + car3.color );
	car3.drive();
	car3.reverse();
	car3.transportPeople();
	
	
	Car car4 = new Car();
		car4.make = "Toyota";
		car4.model = "Tocoma";
		car4.color = "White";
		car4.year = 2020;
		car4.speed = 180;

	System.out.println("Make of truck i want is "
				+ car4.make + " and model is " + car4.model +
				" it is in " + car4.color );
	car4.drive();
	car4.reverse();
	car4.transportPeople();
	
	//new Bus(); complier will give an error
		//because we never created Bus class

	
		


}
}
