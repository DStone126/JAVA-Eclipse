package com.syntax.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
	
	
	int a = 10; 
	int b = 0;
	 
	try {
		
		System.out.println(a/b);
	
		
	}catch(ArithmeticException ae) {
		
		ae.printStackTrace();
		System.out.println("I caught the ArithmeticException");
		
	}
	System.out.println("---------------");
	
	String xlFilePath = System.getProperty("user.dir")+"testdata/SampleData.xlsx";
	
	try {
	FileInputStream fis = new FileInputStream(xlFilePath);
	
	
	}catch(FileNotFoundException fne) {
		System.out.println("I caught the FileNotFoundException");
	}
	
	
	
	System.out.println("----------------");
	
	int[] array = {10,20,30};
	
	try {
		
		System.out.println(array[3]);

	}catch(ArrayIndexOutOfBoundsException aiob) {
		
		System.out.println("i caught ArrayIndexOutOfBoundsException");
	}
	
	Scanner sc = new Scanner(System.in);
System.out.println("Enter number:");
	try {
int num = sc.nextInt();
	
	}catch(InputMismatchException ime) {
		
		System.out.println("i caught InputMismatchException");
	}
	
	
	System.out.println("End of Code");
}
}

