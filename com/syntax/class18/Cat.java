package com.syntax.class18;

public class Cat {

	//instance
	String name,color;
int age;

// static
static int paws = 4;
static boolean mustache = true;
static boolean tail = true;

void displayCat() {
	System.out.println("Name of the cat is "+
name + " and this cat is " + color + " and it is "
+ age + " years old");
}
void displayCommonFeatures() {
	System.out.println(name + " has "+ paws+ " paws and "
			+ tail + " tail and mustache " + mustache);
}


String eId = "";
int salary = 500000;
String ceo = "Sumair";

void displayEmplyeeInfo() {
	System.out.println("Employee name on id"+eId+ " he has a contrack for "+ salary+ " and his CEO is " + ceo);
}






}

