package com.syntax.class11;

public class ArrayHomeWork {
public static void main(String[] args) {
	
	String[] cars = {"american", "german", "korean", "italian"};
	
	for(int c = 0; c < cars.length; c++) {
	System.out.println(cars[c].replaceAll("[^A-Za-z0-9]", ""));
}
	System.out.println("---------------------");

	int car = 0;
	while (car < cars.length) {
		System.out.println(cars[car]);
		car++;
	}
	
	System.out.println("-----------------------");	

String[] countries = {"USA", "Honduras", 
		"Spain", "China", "Gana"};
		
for(int o = 0; o < countries.length; o++) {
	System.out.println(countries[o]);

}	
System.out.println("There is " + countries.length + " countries");
	System.out.println("--------------------");
	
	
	int country = 0;
	while (country < countries.length) {
		System.out.println(countries[country]);
		country++;
	
	}
	System.out.println("There is " + countries.length + " countries");
}
}
