package com.syntax.class14;

public class StringMethodContinuing {
public static void main(String[] args) {
	System.out.println("-----.charAt()-------");
	String season = "Summer";
	
	char character = season.charAt(4);
	System.out.println(character);
	System.out.println("--------.index()------");
	
	String hello = "Hello Ana";
	int idexOfAna = hello.indexOf("Ana");
	System.out.println("Inde of Ana in the String " + hello);
			
			
	int index = season.indexOf('m',3);
	System.out.println(index);
	
	System.out.println("-------.substring()----------");
	
	String message = "You guys are awsome";
	String newMessage = message;
	System.out.println(newMessage);
	
	String substring = message.substring(4);// take string starting from index 4
	System.out.println(substring);
	
	String middleWord = message.substring(4, 8);
	System.out.println(middleWord);


}
}
