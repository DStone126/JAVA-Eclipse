package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		int a = 65;
		String s = "bla";
			System.out.println("please some text and press enter!");
		
		String text = scan.nextLine();
       System.out.println("-------------");
		System.out.println(text);
	
		//int a= (int)"thirty three"//compile time error
		
		
		// let me read an integer(age)
	System.out.println(" pleas Enter your age!!");
		int age = scan.nextInt();// if not int ,run time error
	System.out.println("The age that you enter is " + age);
	}
}
