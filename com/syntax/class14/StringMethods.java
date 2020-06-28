package com.syntax.class14;

public class StringMethods {
public static void main(String[] args) {
	
	// 1st way to create a String
	String name = "Damo";//literal
	//2nd way to create a String
	String name1 =new String();
	name1 = "D";
	System.out.println(name);
	System.out.println(name1);

//methods of string class
	String school = "Syntax";
	int size = school.length();//length method
	System.out.println("The length of the Sring is = " + size);


String greetings = "Hello Syntx";
	int sizeOfDifferentString = greetings.length();
	System.out.println(sizeOfDifferentString);

String city = "Dc";//upper case method
String newCity = city.toUpperCase();
System.out.println(newCity);

String lowerCaseString = newCity.toLowerCase();
System.out.println(lowerCaseString);//lower case

String country = "USA ";//concat method
String capital = "Washington DC";
//+ with string serves as concatenation operator
//+ with numbers serves as arithmetic operator
System.out.println(country + capital);
System.out.println(country.concat(capital));//will work only if both values is string type

int day = 27;
String month = "June";
System.out.println(day + month);
System.out.println(month + day);

String str = "";
boolean isEmpty = str.isEmpty();
System.out.println(isEmpty);

String str1 = "";
System.out.println(str1.isEmpty());

String cat = "My cat name is Jessy";
String dog = "		My dog name is Charly		";
System.out.println(cat);
System.out.println(dog);//before trim
System.out.println(cat.trim());
System.out.println(dog.trim());//cut spaces before and after not between


}
}
