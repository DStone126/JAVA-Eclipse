package com.syntax.class14;

public class StringDifference {
public static void main(String[] args) {
	
	String name = "Ana";
	String name1 = new String();
	name1 = "Ana";
	
	System.out.println(name);
	System.out.println(name1);
	
	if(name.contentEquals(name1)) {
		System.out.println("Strings are equal method");
		
	}
	if(name == name1) {
		System.out.println("Strings are equal using == operator");
	}
//	String name2 = "Ana"
//			if(name == name2) {
//				System.out.println("2 String are equal);
//			}
}
}
