package com.syntax.class04;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("What is the amount is needed? ");
		int amount = scan.nextInt();
		if (amount <= 200000) {
			System.out.println("I guess i can give you some money, I dont want to but I guess I can.");
		} else {
			System.out.println("I'm sorry, No money for you!!");
		}
		System.out.println("*********************************************");
		int age;
		
		System.out.println("How old are you? ");
		age = scan.nextInt();
		if (age > 18) {
			System.out.println("You old enough to get an licens.");
		}else {
			System.out.println("I'm sorry, but you can get your learners permit.");

			System.out.println("************************************************");
			String text;
			double d;
			
			System.out.println("Please input city ");
			text = scan.next();
			System.out.println("Please enter temperature in fehrenheit!");
			d = scan.nextDouble();
			double tmc = (d -32)* 5 /9;
			System.out.println("The temperature in  celcius of the city " + text + " is " + tmc);

			System.out.println("*************************************************************");
			boolean cc;

			System.out.println("Do you have a credit card? ");
			cc = scan.nextBoolean();
			if (cc) {
				System.out.println("What is the balance?");
				long balance = scan.nextInt();
				if (balance >= 1000) {
					System.out.println("Pay it off!");
				} else {
					System.out.println("You can spend more. ");

				}
			} else {
				System.out.println("You should get one. ");
			}

			System.out.println("************************************************");
			int years;
			long mon;
			System.out.println("Please enter how many years you worked. ");
			String tex1 = scan.nextLine();
			years = scan.nextInt();
			System.out.println("Please enter your salary");
			mon = scan.nextLong();
			if(years >= 5) {
				System.out.println("You are eligible for bonus.");
			if (mon >= 5000) {
				System.out.println("Your bounus is $10,000");
			}else {
				System.out.println("Your bounus is $2,000");
			}
				
			}else {
				
				System.out.println("You are not eligible");
			}

			/*
			 * int a= 10; Scanner myScanner = new Scanner(System.in); String line =
			 * myScanner.nextLine(); String word = myScanner.nextLine(); int num =
			 * myScanner.nextInt(); double d = myScanner.nextDouble(); boolean b =
			 * myScanner.nextBoolean();
			 */

		}
	}
}
