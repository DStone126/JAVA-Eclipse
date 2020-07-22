package com.syntax.class24;

public class Degree {

	public Degree() {
		
	}
	
	public void getPrerequisite() {
		System.out.println("To get a degree you need a high school diploma");
	}

class Bachelors extends Degree {
	public Bachelors() {
		
		}
		
	}


class Masters extends Degree{
	public Masters() {
		
	}
	public void getPrerequisite() {
		System.out.println("To get a degree you need a Bachelors degree");
}
}
}