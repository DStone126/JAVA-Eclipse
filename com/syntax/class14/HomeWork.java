package com.syntax.class14;

import java.util.Scanner;

public class HomeWork {
public static void main(String[] args) {
	String str= "AAbAA";
	
	int size = str.length();
	if(!str.isEmpty()) {
		if(size >= 3) {
			if (size % 2 != 2) {
				int print = (size/2);
				System.out.println(str.charAt(print));
			}else {
				System.out.println("This string has an even charcters");
			}
			}else {
				
				System.out.println("This string has less than 3 charcters");
			}
		}
	
System.out.println("----------------------------------------------");

Scanner scan = new Scanner(System.in);

System.out.println("Enter your fathers name:");
String  name = scan.nextLine();
System.out.println("Enter mothers name:");
String name1 = scan.nextLine();
System.out.println("Is it boy/girl?");
String gen = scan.nextLine();

String babyName;

if(gen.toLowerCase().equals("boy")) {
	System.out.println("Congratulations, its a boy");
babyName= name.substring(0,name.length()/2) + name1.substring(name1.length()/2);
}else if(gen.equals("girl")) {
	System.out.println("Congratulations, its a girl");
	babyName= name1.substring(0,name1.length()/2) + name.substring(name.length()/2);
}else {
	babyName= "unknown";

}	
System.out.println(babyName.toUpperCase());
scan.close();

//String day = "Sunday";// as long as there is a string-->string-->string-->int
//day.charAt(1);
//char letter=day.toUpperCase().charAt(1);
//int lengthOfNewDay = day.substring(3).toUpperCase().length();
//System.out.println(lengthOfNewDay);// as long as there is a string-->string-->string-->int
System.out.println("-------------------");
// created a String for sunday to go backwords
String day = "Sunday";
String newString="";
for(int i = day.length()-1; i>=0;i--) {
	newString+=day.charAt(i);
}
System.out.println(newString);


}
}
