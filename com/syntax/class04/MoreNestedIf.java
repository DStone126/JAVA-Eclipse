package com.syntax.class04;

public class MoreNestedIf {
public static void main(String[] args) {
	/*Let have a date of month and day of week
	 * if its Friday -->
	 * if date is 13 -->Watch a scary movie
	 * if date is not 13-->Watch a comedy
	 * if its not Friday--> we are going to study ajva
	 */
	
	boolean isFriday = true;
	int date = 17;
	
	if(isFriday ) {
		System.out.println("Its Friday. Im going to watch a movie. ");
	}else {
		System.out.println("Its not Friday. Im going to study Java");
	}
		if(date == 13) {
		System.out.println("im going to watch a scary movie. ");	
		}else {
			System.out.println("Im going to watch a comedy. ");
			
		}
	}
}

