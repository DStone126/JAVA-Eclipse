package com.syntax.class15;

import java.util.Scanner;

public class RepelItStringManipulations {


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
//
//	 Scanner inp = new Scanner(System.in);
//	    System.out.print("In:");
//	    String givenString = inp.nextLine();
//	   	//write your code below
//	   	String givenString1;
//	   
//	      givenString = givenString.replace(" ","");
//	    String newString = "";
//	    for(int i = givenString.length()-1; i>=0;i--) {
//	    	newString += givenString.charAt(i);
//	    }
//	    
//	    if(newString.equalsIgnoreCase(givenString)){
//	    	
//	    	System.out.println("true"); 
//	    }else{
//	    System.out.println("false");
//	    }
//	    
//    System.out.println("-------------------");
//    
//	Scanner inp = new Scanner(System.in);
//    System.out.print("In:");
//    String word = inp.nextLine();
//    //write your code below
//	  
//    //some what how to skipp every other letter
//	for(int w = 0; w < word.length() ; w+= 2){
//		   System.out.print(word.charAt(w));
//	}
//	
//	 //the right way to skip every other letter
//	for(int i=0;i<=word.length()-1;i+=2){
//	      System.out.print(word.charAt(i));
//	    }
//	
//	System.out.println("--------------"); 
//	
//	Scanner inp = new Scanner(System.in);
//    System.out.print("In:");
//    String word = inp.nextLine();
//    //write your code below
//    
//    String newWord = "";
//    for(int i = 0 ; i <= word.length() - 1; i+=1) {
//	 newWord += word.charAt(i);
//	
//    System.out.println(word.charAt(i));
//
//	} 
//	
//	System.out.println("-------------");
//	
//	Scanner inp = new Scanner(System.in);
//    System.out.print("In:");
//    String s = inp.nextLine();
//    //write your code below
//    
//	String news = "";
//    for(int i = 0; i <= s.length() - 1; i++) {
//    	news += s.charAt(i);
//    	System.out.print(s.charAt(i) + " ");
//}	
//	
//    //this is the right way to do it
//    Scanner inp = new Scanner(System.in);
//	System.out.print("In:");
//	String s = inp.nextLine();
//	// write your code below
//
//	String newString = "";
//	for (int i = 0; i <= s.length() - 1; i++) {
//		
//		if(i!=s.length()-1) {
//			newString = newString + s.charAt(i) + " ";
//		}else {
//			newString = newString + s.charAt(i);
//		}
//}
//		System.out.println(newString);
//	
//System.out.println("--------------------");
//
//	Scanner input = new Scanner(System.in);
//	String[] arr = new String[5];
//	//leave above alone!  write your code below
//	
//	for (int i=0;i<arr.length;i++) {
//		arr[i] = input.nextLine();
//	}
//	
//	for(String a: arr){
//    System.out.println(a.substring(0,3));
//  }
//
//System.out.println("----------------");
//
//	Scanner inp = new Scanner(System.in);
//    System.out.print("In:");
//    String word = inp.nextLine();
//    //write your code below
//
//    for(int s = 0; s < word.length(); s++){
//        char c = Character.toLowerCase(word.charAt(s));
//        if (c == 'a' || c == 'e'|| c == 'i' || c == 'o' || c == 'u'){
//          System.out.print(word.charAt(s));
//        }
//       
//        Scanner inp = new Scanner(System.in);
//        System.out.print("In:");
//        String word = inp.nextLine();
//        //write your code below
//        //this is how i print vowels only
//        String replace=word.replaceAll("[^aAeEiIoOuU]", "");
//        System.out.println(replace);
//}
//System.out.println("---------------------");
//            
//	StringBuffer str = new StringBuffer("Hello");
//	  str.append(" ");
//	  str.append(" World");
//	  String str1 = str.toString().toUpperCase();
//	  System.out.println(str1);
//	
//	//this is the right way to make stringbuffer to uppercase
//	  StringBuffer str = new StringBuffer(); 
//				
//	str.append("Hello");
//	str.append(" ");
//	str.append("World");
//				
//	String upper = str.toString().toUpperCase();
//				
//	System.out.println(upper);
//
//		System.out.println("---------------");		
//
//	StringBuffer str = new StringBuffer("Hello friends");
//System.out.println(str);
//str.reverse();
//System.out.println(str);
//
// //this the right way to do it
//	
//	String givenString = "Hello Friends";
//
//	StringBuffer sb = new StringBuffer(givenString);
//	sb.reverse();
//
//	String reversedString=sb.toString();
//	
//	System.out.println(reversedString);
//	
//System.out.println("-------------");









}
}
