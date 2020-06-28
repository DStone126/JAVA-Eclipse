package com.syntax.class04;

import java.util.Scanner;

public class ScannerExample {
public static void main(String[] args) {
	
	
	Scanner input =new Scanner(System.in);
	 System.out.println("Please enter your full name!");
	String name = input.nextLine();
	 System.out.println("Your name is " + name);
	 System.out.println("Please enter your age in a double!");
	 double american = input.nextDouble();
	 System.out.println("Your name is " + name + " and age is " + american);

long phoneNumber = input.nextLong();
}
}
