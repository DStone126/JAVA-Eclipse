package com.syntax.class05;

import java.util.Scanner;

public class ScannerR {
public static void main(String[] args) {
	
	/*int a= 10;							
	 * Scanner myScanner = new Scanner(System.in);
	 * String line = myScanner.nextLine();
	 * String word = myScanner.nextLine();
	 * int num = myScanner.nextInt();
	 * double d = myScanner.nextDouble();
	 * boolean b = myScanner.nextBoolean();
	 */
	 
	Scanner myScanner = new Scanner(System.in);
	
	
	System.out.println("Please enter integer!");
	int num = myScanner.nextInt();
	System.out.println(num);
	
	System.out.println("Please enter double!");
	double d = myScanner.nextDouble();
	System.out.println(d);
	
	System.out.println("Please enter if im happy!(True/False");
	boolean b = myScanner.nextBoolean();
	System.out.println(b);
	
	System.out.println("Please enter my name!");
	char myChar = myScanner.next().charAt(0);
	System.out.println(myChar);
}
}
