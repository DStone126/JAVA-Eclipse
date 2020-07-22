package com.syntax.class26;

public abstract class Vehicle {

	
	public String vin;
	
	public static int totalVehicles;
	
	public Vehicle(String vin) {
		this.vin = vin;
	}
	
	public static int getTotal() {
		return totalVehicles;
	}
	
	void drive() {
		System.out.println("All vehicle is used to drive");
	}
	void stop() {
		System.out.println("All vehicles to stop press breakes");
	}
	abstract void start();
	
	abstract void openTrunk();
	
	
}
class Bus extends Vehicle{
	
	public Bus(String vin) {
		super(vin);
	}
	
	void start() {
		System.out.println("To start bus turn keys");
	}
	void openTrunk() {
		System.out.println("To open the trunk should be done manually");
	}
}
abstract class Car extends Vehicle{
	
	public Car(String vin) {
		super(vin);
	}
	
	void openTruk() {
		System.out.println("Can open trunk automatically");
	}
}
class Tesla extends Car{
	
	public Tesla(String vin) {
		super(vin);
	}
	
	void start() {
		System.out.println("Push button to start car");
	}

	@Override
	void openTrunk() {
		// TODO Auto-generated method stub
		
	}
}
class Lambo extends Car{
	
	public Lambo(String vin) {
		super(vin);
	}
	
	void start() {
		System.out.println("Can start remotely");
	}

	@Override
	void openTrunk() {
		// TODO Auto-generated method stub
		
	}
}