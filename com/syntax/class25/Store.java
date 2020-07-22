package com.syntax.class25;

public class Store {

	String name, location;
	
	public Store(String name, String location){
		this.name = name;
		this.location = location;
	}
	public void openHours() {
		System.out.println(name +" open from 8 AM - 8 PM "+ location);
	}
public void sell() {
	System.out.println(name + " sales items");
}
}
class Macys extends Store{
	public Macys(String name, String location) {
		super(name, location);
	}
	public void openHours() {
		System.out.println(name + " open from 9 AM - 9 PM "+ location);
	}
}
class Starbucks extends Store{
	public Starbucks(String name, String location) {
		super(name, location);
	}
	public void openHours() {
		System.out.println(name + " open from 5 AM - 9 PM "+ location);
}
	public void sellDrinks() {
		System.out.println(name + " sell drinks");
	}
}
class Nike extends Store{
	String shoes;
	public Nike(String name, String location, String shoes) {
		super(name, location);
		this.shoes = shoes;
	}
}
















