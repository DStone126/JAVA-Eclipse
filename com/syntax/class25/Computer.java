package com.syntax.class25;

public class Computer {

	String name, location;
	
	public Computer(String name, String location) {
		this.name = name;
		this.location = location;
	}
	public void brand() {
		System.out.println(name +" brand isnt all that important as long it gets the job done "+ location);
	}
	public void price() {
		System.out.println("Price varys on the name of brand ");
	}
}
class Apple extends Computer{
	public Apple(String name, String location) {
		super(name , location);
	}
	public void brand() {
		System.out.println(name +" brand is very expensive "+ location);
	}
	public void price() {
		System.out.println(name +" price varys on gen or how powerful it is ");
	}
}
class Lenovo extends Computer{
	double price;
	public Lenovo(String name, String location, double price) {
		super(name, location);
		this.price = price;
	}
	public void brand() {
		System.out.println(name +" brand is for gaming i belive "+ location);
	}
	public void price() {
		System.out.println(name +" price is "+ price);
	}
}
class Hp extends Computer{
	public Hp(String name, String location) {
		super(name , location);
	}
	public void brand() {
		System.out.println(name +" brand is ok "+ location);
	}
	public void price() {
		System.out.println(name +" price varys on your personal taste ");
	}
}
class Dell extends Computer{
	public Dell(String name, String location) {
		super(name, location);
}
}

