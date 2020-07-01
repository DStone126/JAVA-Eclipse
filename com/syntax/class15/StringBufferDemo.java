package com.syntax.class15;

public class StringBufferDemo {
public static void main(String [] args) {
	
	StringBuffer strBuffer = new StringBuffer("Hello");//mutable object
	strBuffer.append(" friends ");//we perform operation it happens on same object and no new object get created
	System.out.println(strBuffer);//hell friends
	
String str2 = "Hello";//String is immutable object = not complete
str2.concat(" friends ");//new object gets created that will have value "hello friends"--->no one takes it

System.out.println(str2);//hello




































}
}
