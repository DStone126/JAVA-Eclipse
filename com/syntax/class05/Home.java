package com.syntax.class05;

import java.util.Scanner;

public class Home {
	public static void main(String [] args){
	
	
	
	   Scanner scan = new Scanner(System.in);


	 System.out.println("Is it sunny outside? ");
	 boolean isSunny = scan.nextBoolean();
		 if(isSunny) {
			System.out.println(" It is a sunny day, I should go somewhere! ");
		System.out.println("What is the temperature outside? ");	
		 
			int temp = scan.nextInt();
			if (temp > 85) {
			System.out.println("I am  going to the beach! ");
			}else {
				System.out.println("I am going to the park");
			}
			}else {
			System.out.println(" I stay home an d practice Java! ");
	    
	 }
		
		 
	 
	






	}
	}

