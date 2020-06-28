package com.syntax.class08;

import java.util.Scanner;

public class HomeWork {
public static void main(String[] args) {
	/* 1.Write a program that reads the range of integers(start and end point)
	 * provided by a user and then from that range prints 
	 * The sum of even numbers and odd integers
	 * 
	 * 2.Write a program to ask a user to enter item they want to buy 
	 * and the price of that item every time user enters money accumulate the amount and tell
	 * user how much is left to pay off 
	 * if user give more money program should give change
	 * when ever user done with paying program should say 
	 * "Thank you for shopping!"
	 */
	
	
	
	
	Scanner scan = new Scanner(System.in);
	int start; // I don't need to initialize because I will read from input
	int end;
	int sumOdd = 0;
	int sumEven = 0;
	int total = 0;

	System.out.println("Please enter a starting number:");
	start = scan.nextInt();

	System.out.println("Please enter a ending number:");
	end = scan.nextInt();

	for (int i = start; i <= end; i++) {

		if (i % 2 == 0) { // even number
			sumEven += i;
		} else { // odd number
			sumOdd += i;
		}

		// 1st way
		// total += i;
	}

	System.out.println("The sum of even numbers is " + sumEven);
	System.out.println("The sum of odd numbers is " + sumOdd);
	
	// 2nd way
	total = sumEven + sumOdd;
	System.out.println("The sum of all numbers is " + total);
}




}



