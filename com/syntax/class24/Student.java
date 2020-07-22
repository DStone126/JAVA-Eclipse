package com.syntax.class24;

class Human{
	
	public void happy() {
		System.out.println("Humans are happy");
	}
	public void study() {
		System.out.println("Humans should study");
	}
}

public class Student extends Human{

	public void study() {
		System.out.println("All students study");
	}
	public void sleepy() {
		System.out.println("Students are always sleepy");
	}
}
class SyntaxStudent extends Student {
	public void inLoveWithJava() {
		System.out.println("Syntax students love JAVA the most");
	}
	public void study() {
		System.out.println("Syntax students studying harder then anybody");
	}
	public void sleepy() {
		System.out.println("We never sleep");
	}
}
class CollegeStudent extends Student {
	public void read() {
		System.out.println("College students read tons of books");
	}
}
class SchoolStudent extends Student {
	public void study() {
		System.out.println("School time best time ever");
	}

	public static void main(String[] args) {
		Student std = new SyntaxStudent();
		std.study();
		std.sleepy();
		
		SyntaxStudent syntax = new SyntaxStudent();
		syntax.inLoveWithJava();
		
		Student col = new CollegeStudent();
		col.sleepy();
		col.study();
		
		CollegeStudent col1 = new CollegeStudent();
		col1.read();
		
		Student sc = new SchoolStudent();
		sc.study();
		sc.sleepy();
	
	 Human obj = new SchoolStudent();
	obj.happy();
	obj.study();
	}
}
