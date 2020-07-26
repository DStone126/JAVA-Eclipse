package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
	
	//lets create an arraylist that will store numbers
	
	ArrayList<Integer> al = new ArrayList<>();
	al.add(100);
	al.add(200);
	al.add(300);
	
	
	System.out.println("Size of al = "+ al.size() + al);
	
	al.add(1);
	al.add(2);
	al.add(2);
	al.add(2);
	
	
	System.out.println("Size of arraylist is "+al.size() + al);
	
	al.remove(2);
	
	System.out.println("Removed an object "+al);
}
}
