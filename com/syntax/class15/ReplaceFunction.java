package com.syntax.class15;

public class ReplaceFunction {
public static void main(String[] args) {
	
	
	
	String me = "I am a good tester. I am a good person";

	String str = "Hello";
str = str.replace('e', 'E');
System.out.println(str);

me = me.replace("good", "great");
System.out.println(me);

me = me.replace("we", "us");
System.out.println(me);

String fromApplications = "Phone number is 1234567890";
fromApplications = fromApplications = fromApplications.replaceAll("[A-Z]", "");
System.out.println(fromApplications);//phone number is1234567890

fromApplications =fromApplications.replaceAll("[a-z]", "").trim();
System.out.println("New String value is = " + fromApplications);

String another = "Hello12345";
another = another.replaceAll("[A-Z]", "").replaceAll("[a-z]", "");

String anotherWay = "HelloYIIghffjfj6576565";//6576565
anotherWay = anotherWay.replaceAll("[A-Za-z]", "");
System.out.println(anotherWay);
//replacing all numbers

String mix = "Hello76588 friends 0976886";
mix = mix.replaceAll("[0-9]", "");
System.out.println(mix);

String mix1 = "hello &*%##%";
mix1 = mix1.replaceAll("[^A-Za-z0-9]", "");
System.out.println(mix1);




System.out.println();
}
}
