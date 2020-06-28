package com.syntax.class10;

import java.util.Scanner;

public class Recap {
public static void main(String[] args) {
	//there are 
	//
	//
	
	Scanner scan = new Scanner(System.in);
	
	
	
	
	
	
	
	System.out.println("How many floor does your hotel have?");
	int rows = scan.nextInt();
	System.out.println("How many room is on each floors?");
	int col = scan.nextInt();
	for(int q =1; q<=rows; q++) {
		//we just moved to new floor
		System.out.print("We are on floor " + q + "--->");
		
		//we are iterating the rooms
		for(int b = 1; b<=col;b++) {
		System.out.print(q + "." + b + " " );

	}//the stairs to the next floor
	System.out.println();
}

	System.out.println("---------------------------");


for(int m = 0; m <= 9; m++) {
	for(int j = 0; j <= 9; j++) {
		for(int n = 0; n <= 9; n++) {
			for(int b = 1; b <= 9; b++) {
				System.out.println(m + "" + j + n + b);
			}
		}
		
		
		
		
	}
}

}
}