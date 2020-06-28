package com.syntax.class13;

public class Phones {
	int year;
	int height;
	int weigth;
	String color;
    String make;
	
	public static void main(String[] args) {
		
	
	Phones phone1 = new Phones();
	phone1.make = "Iphone";
	phone1.color  = "White";
	phone1.weigth = 1;
	phone1.height = 6;
	phone1.year = 2001;
	
System.out.println(" This " + phone1.make + " is " + phone1.color + " it weight is about "
		 + phone1.weigth + " once and its " + phone1.height + " inches tall and came out in " + phone1.year );

phone1.good();
phone1.bad();

Phones phone2 = new Phones();
phone2.make = "Android";
phone2.color  = "Black";
phone2.weigth = 20;
phone2.height = 6;
phone2.year = 3001;

System.out.println(" This " + phone2.make + " is " + phone2.color + " it weight is about "
		 + phone1.weigth + " grams and its " + phone2.height + " inches tall and came out in " + phone2.year );


phone2.good();
phone2.bad();


Phones phone3 = new Phones();
phone3.make = "Nokia";
phone3.color  = "Red";
phone3.weigth = 2;
phone3.height = 10;
phone3.year = 4001;

System.out.println(" This " + phone3.make + " is " + phone3.color + " it weight is about "
		 + phone3.weigth + " pounds and its " + phone3.height + " inches tall and came out in " + phone3.year );

phone3.good();
phone3.bad();
}

	

void good() {
	System.out.println(make + " its over priced but worth it ");
}
void bad() {
	System.out.println(make + " has 8 hours of life ");
}


}
