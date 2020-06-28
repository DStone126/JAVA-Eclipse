package com.syntax.class05;


import java.util.Scanner;

public class ScannerLogicalOperatorsTas {
public static void main(String[] args) {
	/*int a= 10;							
	 * Scanner myScanner = new Scanner(System.in);
	 * String line = myScanner.nextLine();
	 * String word = myScanner.nextLine();
	 * int num = myScanner.nextInt();
	 * double d = myScanner.nextDouble();
	 * boolean b = myScanner.nextBoolean();
	 */
	
	Scanner scan = new Scanner(System.in);
	int inches = 80;
	
	if (inches >= 0 && inches <= 60) {
		System.out.println("Little person!");
	
	 }else if (inches >= 60 && inches <= 72) {
	System.out.println("Averge Joe!");
	
	 }else if (inches >= 72 && inches <= 100) {
	System.out.println( "Should be in NBA!");
	
	 }else {
	
	System.out.println("IDK!!");
}
	System.out.println("******************************************");
	int day = 8;
	
	if(day >= 1 && day <= 5) {
		System.out.println("Weekday!!Boo");
		
		}else if (day >= 6 && day <= 7) {
		System.out.println("Fuck yea Weekend!!");
		
		}else {
			System.out.println("I cant see!!!Oh yea, I'm dead!!");
		}
	System.out.println("**************************************");
	
		System.out.println("Do you need a loan?");
		boolean t = scan.nextBoolean();
		if (t == false){
		  System.out.println("The eligibility is Unknown");
		  }else if(t == true){
		System.out.println("What is your credit score?");
		int num = scan.nextInt();
		if (num <600) {
						System.out.println("The eligibility is Not eligible");
					
		  
		}else if (num >= 600 && num <= 700) {
					System.out.println("The eligibility is Maybe eligible");
					
		  
		}else if (num >= 701 && num <= 800) {
					System.out.println("The eligibility is Eligible");
					
		  
		}else if(num > 800){
					  System.out.println("The eligibility is Definitely eligible");
		  

		}

		    
		  }
		}

}

