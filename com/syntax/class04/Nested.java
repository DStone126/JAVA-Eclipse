package com.syntax.class04;

public class Nested {
		public static void main(String[] args) {
			//nested if
			/*if (boolean expression)
			 * inner code....
			 * if (another boolean expression){
			 *  inner code...
			 * }else
			 */
		boolean isMorning = true;
		boolean isSchool = false;
		int time = 20;
		
		if (isMorning) {
			System.out.println("Good morning!");	
			
			if (isSchool) {
			System.out.println("Friends");
			} else {
			System.out.println("Familiy");
			}
			System.out.println("bye");
		}else {
				System.out.println("Its not morning!");
			
			if(time < 18) {
			System.out.println("Good afternoon!");
			}else {
				System.out.println("Good evening!");
			}
		}
			System.out.println("Viktoria has no questions. ");
		}
	}



		
		