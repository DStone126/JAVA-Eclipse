package com.syntax.class24;

public class BirdTest {
public static void main(String[] args) {
	
	 Bird b = new BabyBird();//upcasting--> object of subclass is reffered by a Superclass
	 b.fly();//runtime polymorphism
	 b.eat();//runtime polymorphism
	 b.sleep();
	 //b.cry();not available
	
	 System.out.println("--------------------");
	 BabyBird bb = new BabyBird();// down casting-->
	 bb.fly();
	 bb.eat();
	 bb.sleep();
	 bb.cry();
}
}
