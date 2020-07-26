package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListTask {
public static void main(String[] args) {
	
	ArrayList<String> a = new ArrayList<>();
	a.add("Damien");
	a.add("Ana");
	a.add("Irr");
	a.add("Elias");
	a.add("Lucien");
	
	System.out.println("Size of array is "+ a.size()+ a);
	
	System.out.println("Array object name is "+ a.get(3)+" is it empty "+ a.isEmpty());
	System.out.println(a.get(0)+ " "+ a.contains("Damien"));

	
	
}
}
