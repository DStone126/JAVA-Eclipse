package com.syntax.class07;

import java.util.Scanner;

public class ScannerLoops {
public static void main(String[] args) {
	//ask name 5xs and print good after name 5xs
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter name:");
	int nam = 1;
	while( nam < 5) {
	String name = scan.nextLine();
	System.out.println("Good Afternoon " + name);
	nam++;
	}
	
	System.out.println("-----------------DWL----------------");
	
	int x = 1;
	do {
		System.out.println("Please enter name:");
		String name1 = scan.nextLine();
		System.out.println("Good Afternoon " + name1);
	x++;
	}while (x < 5);
	
}
}
