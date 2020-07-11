package com.syntax.class20;

public class BettterCarTest {
//new BetterCar();CE:because we do not have a non argument constructor inside BetterCar class
	public static void main(String[] args) {
	
BetterCar car = new BetterCar("X5", "Red", 2020, 80000);
car.displayInfo();

BetterCar car1 = new BetterCar("Model S", "Silver", 2019, 90000);
car1.displayInfo();
}
	
//new Bettercar(carModel, carColor)	CE:because we do not have a constructor with 2 parameters inside BetterCar class
}
