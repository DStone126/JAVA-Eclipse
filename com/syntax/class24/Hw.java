package com.syntax.class24;

public class Hw {
	
//	Create 1 class in which create a methods that will calculate the area (volume) of 
//	Rectangle
//	Square
//	Box
	
	
	public double Area(double length, double width) {
		return length * width;
	}
	public double Area(double length) {
		return length * length;
	}
	public double Area(double length, double width, double height) {
		return 2 * length * width + 2 * length * height + 2 * width * height;
	}
}
