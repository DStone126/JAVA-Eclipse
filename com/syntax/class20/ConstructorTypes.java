package com.syntax.class20;

public class ConstructorTypes {

	ConstructorTypes(){
		System.out.println("I am a constructor");
	}
	
	ConstructorTypes(String str){
		System.out.println("I am a constructor with 1 parameter"+ str);
		
	}
	
	ConstructorTypes(int num){
		System.out.println("I am a constructor with 1 int parameter "+ num);
	}
	
	ConstructorTypes(double num){
		System.out.println("I am a constructor with 1 int parameter "+ num);
	}
	
	ConstructorTypes(String name, int age){
		System.out.println("I am a constructor with 2 parameter "+ name +" "+ age);	
	}
	
	public static void main(String[] args) {
		
		//ConstructorTypes obj = new ConstructorTypes(" Hello World I Fucking Made it!!");
		//ConstructorTypes obj = new ConstructorTypes(100.99);
		ConstructorTypes obj = new ConstructorTypes("Damo", 29);
		
		System.out.println("I am a code inside main method");
	
		speak("Stoney's class");
	}

static  void speak(String str) {
	System.out.println(str);
}

























}
