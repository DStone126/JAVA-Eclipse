package com.syntax.class27;

public class MotorcycleTest {

	public static void main(String[] args) {
		
		//new Driverable();CE: cannot instantiate
		
		//new Motorcycle();CE: cannot instantiate
	
	Motorcycle m = new Bike();
	m.breaking();
	m.driving();
	m.operateVehicle();
	System.out.println(Motorcycle.DRIVE);
	//static variable access
	System.out.println();
	
	Driverable d = new Bike();
	d.breaking();
	d.driving();
	System.out.println(Driverable.DRIVE);
	
	Vehicle v = new Bike();//vehicle-->motorcycle-->bike
	v.operateVehicle();
	
	}
}
