package com.syntax.class20;

public class USA {

	
	//define 2 variables for state and capital and have constructor to initialize it
	
	public static String country = "USA";
	String state, capital;//this is instance variable
	
	USA(String usaState, String stateCapital){//this is  local variable
		state = usaState;
		capital = stateCapital;
	}
	
//	public void display() {
//		System.out.println("State is "+ state +" and its capital is " + capital);
//	}
	void displayState() {
		System.out.println("State is = "+state);
	}
	void displayCapital() {
	System.out.println("Capital is = "+capital);
}
	void displayInfo() {
		displayState();//this.display(); compiler adds this to refer to instance method 
		displayCapital();//this.display(); comiler add this to refer to instance method
//		System.out.println("State is = "+state);
//		System.out.println("Capital is = "+capital);
	}
}
