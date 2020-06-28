package com.syntax.class04;

public class NestedIfTask {
public static void main(String[] args) {
					boolean diploma = true;
					double gpa = 3.92;
				if(diploma)	{
					System.out.println("Congratulations!");
					if(gpa >= 3.5) {
						System.out.println("You are eligible for schlarship.");
					}else {
					System.out.println("You should get a degree.");
					}
				}else {
					System.out.println("You should have studied harder!");
					
				}
				
}
}
