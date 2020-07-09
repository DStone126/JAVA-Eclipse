package com.syntax.class18;

public class House {
public static void main(String[] args) {
	
	Cat cat1 = new Cat();// local variable
	cat1.name= "Jessy";
	cat1.age = 8;
	cat1.color = "grey";
	cat1.color = "Yellow";// declaring local variable
	
	System.out.println("Number of paws " + Cat.paws);
	
	Cat cat2 = new Cat();
	cat2.name = "Lucy";
	cat2.age = 1;
	cat2.color = "White";
	cat2.name = "Bonchuk";
	cat2.mustache = false;// possible way but not the right way
	Cat.tail = false;//this is the best way
	
	System.out.println("Name of 1st cat = " + cat1.name);
	System.out.println("Age of cat " + cat1.age);
	System.out.println("Name of 2nd cat = "+ cat2.name);

	cat1.displayCat();
	cat1.displayCommonFeatures();
	cat2.displayCat();
	cat2.displayCommonFeatures();
	System.out.println("----------3rd cat---------");
	Cat cat3 = new Cat();
	cat3.name = "Karen";
	cat3.age = 4; 
	cat3.color = "Black";

	cat3.displayCat();
	cat3.displayCommonFeatures();

}




















}
