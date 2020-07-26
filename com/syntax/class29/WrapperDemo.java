package com.syntax.class29;

public class WrapperDemo {
public static void main(String[] args) {
	
	int num = 10;
	
	
	Integer num1 = 100;//Auto boxing
	String str = num1.toString().concat(" hello");
	System.out.println(str);
	
	int stringLength = num1.toString().length();
	System.out.println(stringLength);
	
	Byte b = 10;//Auto boxing
	System.out.println(b.MAX_VALUE);
	
	Long l = 10000l;//Auto boxing
	System.out.println(l.MAX_VALUE);
	
	Boolean bo = true;//Auto boxing
	System.out.println();
	
	Character ch = 'a';//Auto boxing
	
	Double d = 10.99;//Auto boxing
	
	
	
	
}
}