package com.syntax.class06;

import java.util.Scanner;

public class TwoBooleanLogicOperatorsScanner {
	 public static void main(String[] args) {
		
	
	
	
	Scanner scan = new Scanner(System.in);
	  

	
		  System.out.println("Are you thirsty?");
		  boolean t = scan.nextBoolean();
		  System.out.println("Are you sleepy?");
		  boolean s = scan.nextBoolean();
		  String  drink;
		  if(t && !s){
		   drink = "Water";
		    }else if(t && s){
		      drink = "Coffee";
		     } else if (!t && s){
		       drink = "Tea";
		     } else{
		       drink = "Nothing";
		       } 
		     System.out.println("Looks like you need to drink " + drink);
		    
		}
		}

	  


	