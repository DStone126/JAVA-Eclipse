package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkSwitch {
	/*.Allow user to enter grade and then provide explanation:
	 *  A-Excellent, B-Good, C-Average, D-Bad, any other grade -->Not Acceptable.
	 *     At the end your program should print which grade was entered by a user with explanation.
	 *  1.HomeWork: Using scanner class create calculator. 
	 * Allow user to enter 2 numbers and operator(+,-,*,/). 
	 * Based on operator provide the result to user.
	 * 
	 */
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter first number");
	int num = scan.nextInt();
	
	System.out.println("Please enter second number");
	int num1 = scan.nextInt();
	
	System.out.println("Please enter a operator");
	char operator = scan.next().charAt(0);
	int calculator = 0;
	
	switch (operator) {
	
	case '*':
		calculator = (num * num1);
		break;
	case '+':
		calculator = (num + num1);
		break;
	case '-':
		calculator = (num - num1);
		break;
	case '/':
		calculator = (num / num1);
		break;

	default:
			System.out.println("Invalid");
}
		System.out.println("The answer is " + calculator );
	
		System.out.println("------------------------------------");
		
		char operator1;
	        Double number1, number2, result;

	        // create an object of Scanner class
	        
	        System.out.print("Enter operator (either +, -, * or /): ");

	        // ask user to enter operator
	        operator1 = scan.next().charAt(0);
	        System.out.print("Enter number1 and number2 respectively: ");

	        // ask user to enter numbers
	        number1 = scan.nextDouble();
	        number2 = scan.nextDouble();

	        switch (operator1) {

	            // performs addition between numbers
	            case '+':
	                result = number1 + number2;
	                System.out.print(number1 + "+" + number2 + " = " + result);
	                break;

	            // performs subtraction between numbers
	            case '-':
	                result = number1 - number2;
	                System.out.print(number1 + "-" + number2 + " = " + result);
	                break;

	            // performs multiplication between numbers
	            case '*':
	                result = number1 * number2;
	                System.out.print(number1 + "*" + number2 + " = " + result);
	                break;

	            // performs division between numbers
	            case '/':
	                result = number1 / number2;
	                System.out.print(number1 + "/" + number2 + " = " + result);
	                break;

	            default:
	                System.out.println("Invalid operator!");
	                break;
	        }
	    

//		System.out.println("Please enter grade");
//		String grades = scan.nextLine();
//		
//		System.out.println("Please enter explanation");
//		String grades1 = scan.nextLine();
//		
//		char grade = scan.next().charAt(0);
//		
//		switch (grade) {
//		case 'A':
//			grades = "Excellent";
//			break;
//		case 'B':
//			grades = "Good";
//			break;
//		case 'C':
//			grades = "Average";
//			break;
//		case 'D':
//			grades = "Bad";
//			break;
//		case 'F':
//			grades = "Fail";
//			break;
//
//			
//			default:
//				grades = "Not Acceptable";
//			System.out.println("My grade is  " + grades );
//		}
		
		

		
		
		
		
		
		
		
		
		
		



		
		
		
		
		

	
	
	
}	
}



