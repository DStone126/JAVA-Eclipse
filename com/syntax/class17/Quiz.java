package com.syntax.class17;

public class Quiz {
	public static void main(String[] args) {

	       String word ="abrakadabra";

	      String replace=word.replaceAll("[^aAeEiIoOuU]", " ");

	      System.out.println(replace);

	     System.out.println("----------------"); 
	      
	     String str_Sample = "RockStar";
	     System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));

	     System.out.println("----------------");  
	      
	     String c = "Hello i love java";
	     boolean var;
	     var = c.startsWith("hello");
	     System.out.println(var);
	   
	     System.out.println("--------------");
	     
	     String obj = "I LIKE JAVA";
         System.out.println(obj.charAt(3));
	
	System.out.println("------------------");
	
	String str = "0123456789";
	System.out.println(str.substring(4));
	}
}
