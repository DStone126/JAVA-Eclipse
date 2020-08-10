package com.syntax.class32;

public abstract class Animal {

	protected String type,color;
	
	public Animal(String type, String color) {
		this.type = type;
		this.color = color;
		
	}
	
	abstract void eat();
	abstract void sleep();
	
}
class Dog extends Animal{
	
	public Dog(String type, String color) {
		super(type,color);
	}

	public void eat() {
	System.out.println(type +" eats bones");
}

public void sleep() {
	System.out.println(type +" sleeps alot");
}
}
class Zebra extends Animal{
	
	public Zebra(String type, String color) {
		super(type,color);
	}

	protected void eat() {
		System.out.println(type +" eats grass");
	}

	protected void sleep() {
		System.out.println(type +" sleeps outside");
	}
}

class Monkey extends Animal{
	
	public Monkey(String type, String color) {
		super(type,color);
	}

	protected void eat() {
		System.out.println(type +" eats fruits");
	}

	protected void sleep() {
		System.out.println(type +" sleeps in a tree");
	}
}










