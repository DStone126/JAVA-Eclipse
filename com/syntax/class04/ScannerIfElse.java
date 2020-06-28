package com.syntax.class04;

import java.util.Scanner;
			
public class ScannerIfElse {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	Scanner input =new Scanner(System.in);
	int num = scan.nextInt();
	System.out.println("Please enter another number.");
	int num2 = scan.nextInt();
	System.out.println("please enter another number.");
	if (num > num2) {
	System.out.println(num + " is larger than " + num2);
	}else if (num < num2) {
		System.out.println(num + " is smaller than " + num2);
	}else {
		
	}
	}
	
	
}

