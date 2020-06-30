package com.syntax.class15;

import java.io.PrintStream;
import java.util.Scanner;

public class RepelItStringManipulations {
private static Object array;

public static void main(String[] args) {
	
//	String str1 = "syntax technologies";
//	  String str2 = "SYNTAX TECHNOLOGIES";
//	  str1 = str1.toUpperCase();
//	  str2 = str2.toLowerCase();
//	  System.out.println(str1.toUpperCase());
//	  System.out.println(str2.toLowerCase());
//	
//	System.out.println("-----------------");
//	
//	 //starts the code from here
//	   String s1="hello how are you"; 
//	  
//	    boolean ends = s1.endsWith("u");
//	  System.out.println(ends);
//	    
//	  boolean end = s1.endsWith("world");
//	    System.out.println(end);
//	  
//	    boolean eds = s1.endsWith("are");
//	    System.out.println(eds);
//	  
//	    boolean ens = s1.endsWith("you");
//	    System.out.println(ens);
//	  
//	   //this the right way to do it
//	   System.out.println(s1.endsWith("u"));       
//	   System.out.println(s1.endsWith("world"));     
//	   System.out.println(s1.endsWith("are")); 
//	   System.out.println(s1.endsWith("you"));  
//	
//	System.out.println("-------------------");
//	
//	   String s1 ="hello";
//	   String s2 = "";
//	   
//	   System.out.println(s1.isEmpty());
//	   System.out.println(s2.isEmpty());
//	
//	System.out.println("--------------");
//	
//	//this is the right way
//	String str = "abracadabra alakazam";
//    String target1 = "dab";
//    String target2 = "ABRA";
//    
//    	System.out.println( str.indexOf("c"));
//	    System.out.println(str.indexOf(" "));
//	    System.out.println(str.indexOf(target1));
//	    System.out.println(str.indexOf(target2));
//	
//	String str = "abracadabra alakazam";
//    String target1 = "dab";
//    String target2 = "ABRA";
//    
//
//    
//    System.out.println(str.indexOf("c"));
//    System.out.println(str.indexOf(" "));
//    System.out.println(str.indexOf("d"));
//  System.out.println(str.indexOf("A"));
//    
//	System.out.println("-----------------");
//	
//	String given = "I love Java classes at Syntax";
//    
//    String substring1 = given.substring(12,29);
//    
//    String substring = given.substring(0,11);
//    
//    System.out.println(substring1);
//  System.out.println(substring);
//    	
//	System.out.println("----------------");
//	
//	Scanner scan = new Scanner(System.in);
//	  
//	 System.out.println();
//	 String name = scan.nextLine();
//	  
//     String index = name.substring(0,3);
//	  
//	 System.out.println("The first 3 letters of " + name +
//	  " is " + index);
//	
//	 //	this is the right way to do it
//	 Scanner a=new Scanner(System.in);
//	    String ab=a.nextLine();
//	    System.out.println("The first 3 letters of "+ab+ " is "+ ab.substring(0,3));
//	 
//	 System.out.println("--------------");
//	
//	Scanner sc = new Scanner(System.in); 
//	  System.out.println("Enter any programming language");
//	   String language = sc.nextLine(); 
//	  
//	  if(language.equals("Java")){
//	    System.out.println("Java is a programming language");
//	       
//	   }else if(language.equals("C")){
//	        System.out.println("C is a procedural programming language");
//	        
//	   } else if(language.equals("C++")){
//	          System.out.println("C++ is a middle-level programming language");
//	          
//	        }else{
//	          System.out.println("Doesn't match any programming language");
//	        }
//	     
//		//this is the right way to do it
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter any programming language");
//	String language = sc.nextLine();
//	String message;
//
//	switch (language.toLowerCase()) {
//
//	case "java":
//		message = "Java is a programming language";
//		break;
//	case "c":
//		message = "C is a procedural programming language";
//		break;
//	case "c++":
//		message = "C++ is a middle-level programming language";
//		break;
//	default:
//		message = "Doesn't match any programming language";
//	}
//
//	System.out.println(message);
//
//	System.out.println("----------------------");
//
//	Scanner sc = new Scanner(System.in); 
//    System.out.println("Enter the browser name to proceed further with execution");
//    String browser = sc.nextLine(); 
// String browser1;
//
// switch (browser.toLowerCase()){
//   
//   case "chrome":
//     browser1 = "Proceed with Chrome browser";
// break;
// 
// case "FireFOX":
//   browser1 = "Proceed with Firefox browser";
//   break;
//   
//   case "IE":
//     browser1 = "Proceed with IE browser";
//   break;
//   
//   default:
//   browser1 = "Invalid browser";
// }
// System.out.println(browser1);
// 
// //this is the right way
// Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the browser name to proceed further with execution");
//	String browser = sc.nextLine();
//	
//	if (browser.equalsIgnoreCase("Chrome")) {
//		System.out.println("Proceed with Chrome browser");
//	} else if (browser.equalsIgnoreCase("Firefox")) {
//		System.out.println("Proceed with Firefox browser");
//	} else if (browser.equalsIgnoreCase("Ie")) {
//		System.out.println("Proceed with IE browser");
//	} else {
//		System.out.println("Invalid browser");
//	}
//	
//	System.out.println("-------------------");
//
//	 String given = "Hello Syntax friends";
//	    given = given.replace("Hello","Welcome");
//	    given = given.replace("friends","family");
//	    System.out.println(given);
//	    
////this is the right way to do it
//String given="Hello Syntax friends";
//
//given=given.replace("Hello", "Welcome").replace("friends", "family");
//
//System.out.println(given);
//	
//	System.out.println("--------------");
	
	Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String givenString = inp.nextLine();
   	//write your code below
   	
   
    
    boolean palindrome = true;
	
    String given = "" ;
    String newString = "";
    
    for(int i = given.length()-1; i>=0;i--) {
    	newString+=given.charAt(i);
    System.out.println(palindrome);
    if (given == givenString){
	  System.out.println("false");
	  }else {
	System.out.println("true");
   
    
    }
    

    
    
    
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	













   }
}

