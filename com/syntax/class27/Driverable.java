package com.syntax.class27;

public interface Driverable {// interface is a collection of public abstract methods and public static final variables
	
	public static final String DRIVE = "Drive safe";//by default compiler adds static final to variables
	
	//int maxSpeed; cannot have instance variables because compiler adds PSF
	
	void driving();// by default compiler adds public abstract to methods
	
	void breaking();
}
//can only extends 1 class but we can implement MULTIPLE interface
abstract class Motorcycle extends Vehicle implements Driverable{
	
	public void driving() {
		System.out.println("Motorcycle is driving");
	}
	}
class Bike extends Motorcycle{
		
		public void breaking() {
			System.out.println("Bikes can break");
		
	}
}
class Vehicle {
	
	public void operateVehicle() {
		System.out.println("to operate vehicle you need driver licens");
	}
}