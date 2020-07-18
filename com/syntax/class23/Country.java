package com.syntax.class23;

public class Country {
	String name;
	Country(String name){
		this.name = name;
		System.out.println("i am parent class constructor");
	}
	}
	 class Italy extends Country{
		String food;
		
	Italy(String food, String name){
		super(name);
		this.food = food;
		System.out.println("i am a child class constructor");

	}	
	public static void main(String [] args){
		Italy obj = new Italy("Pizza", "Italy");
	
	
	
	}
}
