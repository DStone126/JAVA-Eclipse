package com.syntax.class28;

public class Task1 {

	//Create an Interface 'Shape' with undefined methods 
	//as calculateArea and calculatePerimiter.
	//Create 2 classes Circle & Square that implements functionality defined 
	//in the Shape Interface. Test your code.

	public static void main(String[] args) {
		
		Circle a = new Circle();
		a.calculateArea(5);
		a.calculatePerimiter(5);
		 
		Square b = new Square();
		b.calculateArea(4);
		b.calculatePerimiter(4);
	}
}

interface Shape {
	void calculateArea(int a);
	void calculatePerimiter(int a);
}

class Circle implements Shape {

	public void calculateArea(int radius) {
		int diametr = radius * 2;
		double s = (3.14 * (diametr * diametr)) / 4;
	
		System.out.println("The area is " + s);
	}
	
	public void calculatePerimiter(int radius) {
		int diametr = radius * 2;
		double p = 3.14 * diametr;
	
		System.out.println("The perimetr is " + p);
	}
}

class Square implements Shape {
	
	public void calculatePerimiter(int a) {

		System.out.println("The perimeter is " + (a * 4));
	}
	
	public void calculateArea(int a) {
	
		System.out.println("The area is " + (a * a));
	
	}
}