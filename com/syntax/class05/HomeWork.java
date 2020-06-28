package com.syntax.class05;

import java.util.Scanner;

public class HomeWork {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter your quiz score!");
			int quiz = scan.nextInt();
			
			System.out.println("Please enter mid-term score!");
			int midT = scan.nextInt();
			
			System.out.println("Please enter finals score");
			int fnl = scan.nextInt();
			
				int qz = (quiz + midT + fnl);
			
			
				if (qz >=90){
				System.out.println("You got an A!! Super!");
				
				}else if (qz ==70 || qz>=90) {
				System.out.println("You got an B!! Great!");
				
				}else if (qz ==50 || qz>=70) {
				System.out.println("You got an C!! Not bad Not good!");
			 	
				}else { 
			 	System.out.println("You got an F!! Fail try harder!");
				}
System.out.println("---------------------------------------------------------------");
		
System.out.println(" Please enter the month you were born in.");

		String month = scan.nextLine();

if(month.equals("October") || month.equals("November") || month.equals("December")) {
	System.out.println("You were born in the Winter");
	
	}else {
	System.out.println("You werent born");
	
	
	}

		
		}
}
			
			
			
			
			
			
			
			
			
			
			
		

