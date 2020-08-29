package com.syntax.class35;

public class FinallyBlock {

	public static void main(String[] args) {

		String str = "Java";
		
		try {
			
			System.out.println("im a try block");
		char letter = str.charAt(10);
		System.out.println(letter);
		
		}catch(Exception e) {
			
			System.out.println("im a catch block");
			System.out.println(e);
	
		}finally {//always get executed regardless if E occurs or not
			System.out.println("im a finally block");
		}
	
		System.out.println("End of Code");
	}
}
