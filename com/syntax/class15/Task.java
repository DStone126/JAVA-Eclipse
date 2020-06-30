package com.syntax.class15;

public class Task {
public static void main(String[] args) {
	
//	1.Create a String that will hold a sentence.
//	Write a program to get a new String without any spaces.
//	2.Create a String that should be combination of letters,
//	numbers and special characters. Find out how many 
//	alpha characters are there in the String.
//	3.You have a String a=“Is it saturday?
//	Is it raining? Do we have a Java Class today?”
//	How would you find out how many sentences are in that String?

//NO SPACES
String str = "Hello im new to this, its hard but im trying my best. ";
str = str.replaceAll("[^A-Za-z0-9]", "");
System.out.println(str);

System.out.println("------------------------------");
//idk if its right
String mix = "Hellow 1im new134 @at *this";
//interview ?
mix = mix.replaceAll("[^A-Za-z]", "");
System.out.println(mix.length());
System.out.println(mix);

System.out.println("-------------------------");
//
String a = "1.Is it saturday?2. Is it raining? Do we have a Java Class today?3.";
String[] array = a.split("0-9");

int howManyS = a.length();
System.out.println("Total number of sentences is " + howManyS);

System.out.println("----------------------");

String str1 = "Today is a good day";
str1 = str1.replace("good", "amazing");
System.out.println(str1);

str1.concat(".I love Sundays");
System.out.println(str1);

System.out.println(str1);// original str did not get changed

str1.toUpperCase();// new object gets created but no one is referring to that object

System.out.println(str1);// original str did not get changed

String str3 = new String("Hello");
str3.toUpperCase();

System.out.println("Value of str3 =" + str3);
String str4 = "Hello";
String str5 = "Hello";
String str6 = "Hello";

str4.toUpperCase();// completely new String Object is getting created

System.out.println("Value of str2 if we did not assign it=" + str4);
str4 = str4.toLowerCase();
System.out.println("Value of str2 after assignment=" + str4);
System.out.println("Value of str 3=" + str3);
System.out.println("Value of str 4=" + str5);

String str7 = new String("Hello");


























}
}
