package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListIntro {
public static void main(String[] args) {
	
	ArrayList <String> arrayList = new ArrayList<>();
	//to add values to the arrylist 
	arrayList.add("Hello");//0
	arrayList.add("Welcome");//1
	arrayList.add("How are you");//2
	
	
	// how many elements my arrayList?
	int arrayListSize = arrayList.size();
	System.out.println("Orginal arraylist "+arrayListSize+ arrayList);
	
	System.out.println();
	
	// how to access elements from ArrayList
	String elementIndex2 = arrayList.get(2);
	System.out.println(elementIndex2);
	
	System.out.println();
	
	// i would like to addd more objects into ArrayList
	arrayList.add("Good Bye");//3
	arrayList.add("Thank you");//4
	
	System.out.println("Size of array list after adding more String objects = " + arrayList.size()+ arrayList);
	
	System.out.println();
	
	//lets remove hello
	
	arrayList.remove(0);
	
	System.out.println("Size of arraylist after removing object = "+ arrayList.size()+ arrayList);

	System.out.println();
	
	// i want to update value goodbye -->bye
	arrayList.set(2, "Bye");
	System.out.println("arraylist after replacing object"+arrayList);
	
	System.out.println();
	
}
}
