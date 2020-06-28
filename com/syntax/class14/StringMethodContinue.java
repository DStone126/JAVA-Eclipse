package com.syntax.class14;

public class StringMethodContinue {
public static void main(String[] args) {
	
	System.out.println("---------- .contains() method------------");
//checks if string contains another sequence of specified characters
	
	String str = "Good afternoon all";
String searchValur = "afternoon";

boolean contains = str.contains("afternoon");
System.out.println(contains);

String searchValue = "Good";

boolean isItThere = str.contains(searchValue);
System.out.println(isItThere);

System.out.println(str.contains("a"));

System.out.println(str.contains("after"));

System.out.println("--------.startsWith() method------------");

String drink = "water";
boolean starts = drink.startsWith("w");
System.out.println(starts);

System.out.println("-------.endsWith() method-------------");

boolean ends = drink.endsWith("a");
System.out.println(ends);
//drink.startsWith('w');CE: we need to check if it starts with specified string

String str1 = "Hellow Mom";
String str2 = "Hello Ana";

str1.startsWith("Hello");
str2.endsWith("Ana");
System.out.println("String " + str1 + " " + str.startsWith("Hello"));
System.out.println(str2.endsWith("Ana"));

System.out.println("------.equals() method---------");

String string1 = "Saturday";
String string2 = "Saturday";

boolean equality = string1.equals(string2);
System.out.println(equality);

boolean equalityNoCase = string1.equalsIgnoreCase(string2);
System.out.println(equalityNoCase);

String expected = "Password cannot be empty";
String actual = "Password can not be empty";
if(expected.equals(actual)) {
	System.out.println("Test pass");
}else {
	System.out.println("Test fail");
	System.out.println("----real example of equalsIgnorCase--------");
			
String expectedBrowser = "Chrome";

}



















}


}
