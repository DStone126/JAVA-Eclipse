package com.syntax.class19;

public class AppleStore {
public static void main(String[] args) {
	
	IPhone phone1 = new IPhone();
	phone1.model = "11 Pro";
	phone1.memory =256;
	phone1.color = "Blue";
	phone1.price = 1000;
	phone1.displayDetails();
	// phone1.displayInfo();-->possible but not 
	
	//IPhone.displayInfo();
	
	IPhone.touchScreen = false;
	
	System.out.println("---------2nd phone------");

	IPhone phone2 = new IPhone();
	phone2.model = "11";
	phone2.memory =64;
	phone2.color = "Pink";
	phone2.price = 900;
	phone2.displayDetails();
	phone2.displayInfo();
	
	System.out.println("-----calling info method again-------");
	phone1.displayInfo();
	
}
}
