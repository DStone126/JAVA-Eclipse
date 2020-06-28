package com.syntax.class06;

public class Recap {
public static void main(String[] args) {
	 /*if hour is between 1-11-->morning
	  * if hour is between 12-15-->afternoon
	  *if hour is between 16-20-->evening
	  * if hour is between 21-24-->night
	  * we will print: right now is______
	  */
	
	  
	
	int hour = 5;
			String dayTime;
	if(hour>=1 && hour<= 11) {
			System.out.println("right now its morning");	
			dayTime = "morning";
			}else if(hour>=12 && hour<= 15) {
				System.out.println("right now its afternoon");
			dayTime = "afternoon";
			}else if(hour>=16 && hour<= 20) {
				System.out.println("right now its evening");
			dayTime = "evening";
			}else if(hour>=21 && hour<= 24) {
					System.out.println("right now its night");
				dayTime = "night";
			}else {
				dayTime = "unknown";
			}
				//if is it unknown i dont want to print anything
			if(!dayTime.equals("unknown")) {	
	System.out.println("right now its " + dayTime);
			}
}
}
