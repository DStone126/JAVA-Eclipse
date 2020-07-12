package com.syntax.class21;

public class TheKeywordTest {

	public static void main(String[] args) {
		
		ThisKeyword obj = new ThisKeyword(100,200);
		obj.sum(10, 20);
	
		ThisKeyword obj1 = new ThisKeyword();
		obj1.sum(20, 50);
	}
}
