package com.syntax.class08;

import java.util.Scanner;

public class Lottery {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int lucky = 17;
	int num;
	
	
	System.out.println("Please enter number 1-20:");
	num  = scan.nextInt();

	while(num !=lucky) {
	System.out.println("Please enter number 1-20:");
	num  = scan.nextInt();

}
	
	System.out.println("Congrats, you Won!");
	
//	do {
//		System.out.println("Please enter number 1-20:");
//		
//	}while(num !=lucky);
//		System.out.println("Congrats, you Won!");
//	}
		
	
	
	
	
	
	
	
	
	
}	
}

