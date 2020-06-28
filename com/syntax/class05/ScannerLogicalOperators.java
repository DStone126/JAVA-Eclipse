package com.syntax.class05;

import java.util.Scanner;

public class ScannerLogicalOperators {
	/*int a= 10;							
	 * Scanner myScanner = new Scanner(System.in);
	 * String line = myScanner.nextLine();
	 * String word = myScanner.nextLine();
	 * int num = myScanner.nextInt();
	 * double d = myScanner.nextDouble();
	 * boolean b = myScanner.nextBoolean();
	 */			
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int age = 28;
		
			if (age >= 0 && age <= 3) {
				System.out.println(" You are in a diaper!");
			
			 }else if (age >= 4 && age <= 5) {
			System.out.println(" You are kid!");
			
			 }else if (age >= 6 && age <= 12) {
			System.out.println( " You are a squeaker!");
			
			 }else if (age >= 13 && age <= 19) {
			System.out.println( " You are teen!");
			}else if (age >= 20 && age <= 64) {
			
			System.out.println( " You are old!!");
			}else {
			
			System.out.println("Bout to kick the bucket!!");
}
		System.out.println("------------------------------------------");
		
		int age1 = 28;
		
		if (age1 >= 0 || age1 <= 3) {
			System.out.println(" You are in a diaper!");
		
		 }else if (age1 >= 4 || age1 <= 5) {
		System.out.println(" You are kid!");
		
		 }else if (age1 >= 6 || age1 <= 12) {
		System.out.println( " You are a squeaker!");
		
		 }else if (age1 >= 13 || age1 <= 19) {
		System.out.println( " You are teen!");
		}else if (age1 >= 20 || age1 <= 64) {
		
		System.out.println( " You are old!!");
		}else {
		
		System.out.println("Bout to kick the bucket!!");
}
		System.out.println("******************************************************");
		
		
		
		
		
		
	}
}
