package com.syntax.class26;

public class VehicleTest {

	public static void main(String[] args) {
		
		Vehicle lambo = new Lambo("1234567890thefuk");
		lambo.drive();
		lambo.start();
		lambo.stop();
		lambo.openTrunk();
		int total = Vehicle.getTotal();
		System.out.println(total);
		
		Car car = new Lambo("0987654321theFuk");
		car.drive();
		car.start();
		car.stop();
		car.openTruk();
		
		total = Car.getTotal();
		System.out.println(total);
		
	}
}
